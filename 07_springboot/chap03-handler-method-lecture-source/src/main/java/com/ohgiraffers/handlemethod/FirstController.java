package com.ohgiraffers.handlemethod;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller   // @RequestMapping,GetMapping 등의 어노테이션 기능을 사용 가능하게 해준다.
@RequestMapping("/first")   // 처음 주소 부분을 지정한다. 그럴경우 중복해서 같은 경로를 입력할 필요는 없다.
public class FirstController {

    /* 설명. 핸들러 메소드에서 반환형이 없을 경우 요청경로를 반환한다.(요청 경로가 곧 view) */
//    @GetMapping("/first/regist")
    @GetMapping("/regist")
//    public String regist(){
//        return "/first/regist";
//    }
    public void regist(){}

    @PostMapping("regist")
    public String registMenu(HttpServletRequest request, Model model){
        // regist.html에서 요청한 정보를 담는 request와 그에 필요한 모델을 제공받는데 handlerAdapter가 해준다
        // HttpServletRequest는 regist.html에서 가져온 값을 담기 위해 필요한건 알겠는데 model은 왜 부른겨?
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int categoryCode = Integer.parseInt(request.getParameter("categoryCode"));

        /* 설명. Service 계층의 메소드를 호출하여 비지니스 로직(insert 트랜잭션)을 성공하고 돌아왔다는 가정 */

        /* 설명. insert 성공 메세지와 함계 성공 페이지로 이동 */
        String message = name + "을(를) 신규 메뉴 목록의" + categoryCode + "번 카테고리에 "
                + price + "원으로 등록에 성공하였습니다!";
        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    // 왜 굳이 GetMapping을 한 다음 PostMapping을 햇을까?
    @GetMapping("modify")
    public void modify(){}

    /* 설명.
     *  request parameter로 넘어오는 값들의 key값과 일치하는 변수명(이노테이션 생략가능)을 작성하고 @RequestParam
     *  이노테이션을 적용하면 알아서 값을 꺼내고 해당 매개변수의 자료형에 맞게 자료형 변환까지 해준다,(물론 가능한 경우)
     *
     * 설명.
     *  1. defaultValue: 사용자의 입력 값이 없거나("") 아니면 request의 parameter 키 값과 일치하지 않는
     *                   매개변수 사용 시 매개변수가 가질 기본 default값을 작성한다.
     *  2. name: request parameter의 키 값과 다른 매개변수 명을 사용하고 싶을 때 request parameter의
     *           키 값을 작성한다.
    * */

    // 따로 servlet 처럼 Integer로 변한시기키지 않아도 된다.
    @PostMapping("modify1")     // 이렇게 하나씩 매개변수가 많을 경우 값이 많이 들어올 경우에는 코드의 가독성이 떨어진다,
    public String modifyMenu1(Model model,
                              @RequestParam(name="modifyName", defaultValue = "디폴트") String modifyName,
//                              String modifyName,
//                              @RequestParam(name="modifyPrice", defaultValue = "0") int modifyPrice)
                              int modifyPrice){ // 넘어온 parameter의 키 값과 일치하며 해당 타입으로
                                                // 변환 가능하면 @RequestParam 생략 가능
        String message = modifyName + "메뉴의 가격을 " + modifyPrice + "로 변경하였습니다.";
        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    /* 설명. @RequestParam을 활용해 하나의 Map으로 받아낼 수 있다. */
    @PostMapping("modify2")
    public String modify2(Model model, @RequestParam Map<String,String> paramterMap){
        String modifyName = paramterMap.get("modifyName");
        int modifyPrice = Integer.parseInt(paramterMap.get("modifyPrice"));

        String message = modifyName + "메뉴의 가격을 " + modifyPrice + "로 변경하였습니다.";
        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    @GetMapping("search")
    public void search(){}

    @PostMapping("search")
    public String searchMenu(){

        return "first/messagePrinter";
    }
}
