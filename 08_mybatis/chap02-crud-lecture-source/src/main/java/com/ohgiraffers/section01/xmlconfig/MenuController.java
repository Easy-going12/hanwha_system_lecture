package com.ohgiraffers.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {
    private final MenuService menuService;

    private final PrintResult printResult;      // 응답 출력용 페이지의 느낌으로 만든 클래스

    public MenuController() {
        this.menuService = new MenuService();
        this.printResult = new PrintResult();
    }

    public void findAllMenus() {
        List<MenuDTO> menuList = menuService.findAllMenus();

        if (!menuList.isEmpty()){       // 하나의 메뉴라도 조회 성공
            printResult.printMenus(menuList);
        } else{                         // 조회 실패(하나의 메뉴도 없는 상태)
            printResult.printErrorMessage("전체 메뉴 조회 실패");
        }
    }

    public void findMenuByMenuCode(Map<String, String> parameter) {
        int menuCode = Integer.parseInt(parameter.get("menuCode"));
        MenuDTO menu = menuService.findMenubyMenuCode(menuCode);

        if(menu != null){
            printResult.printMenu(menu);
        } else{
            printResult.printErrorMessage(menuCode + "번의 메뉴는 없습니다.");
        }
    }
}
