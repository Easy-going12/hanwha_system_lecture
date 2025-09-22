package com.ohgiraffers.restapi.section01.response;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.MediaTray;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//@Controller
@RestController     // 이 컨트롤러의 모든 핸들러 메소드의 응답은 view resolver를 활용하지 않는다.(SSR X)
public class ResponseRestController {
    @GetMapping("/hello")
//    @ResponseBody   // 핸들러 메소드에 응답이 json 형태로 되며 자바의 모든 타입 변환이 가능해 진다.
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/random")
    public int getRandomNumber() {
        return (int)(Math.random() * 10 ) + 1;
    }

    @GetMapping("/message")
    public Message getMessage(){
        return new Message(200, "메세지를 응답합니다.");
    }

    @GetMapping("/test")
    public List<Map<String, Object>> getTest(){
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("test1", new Message(200, "성공1"));
        map.put("test2", new Message(200, "성공2"));
        map.put("maxPageLink", "http://localhost:8080/hello");
        list.add(map);

        return list;
    }

    /* 설명. Http 상태코드를 key로, 메세지를 value로 하는 Map 형태로 변환 */
    @GetMapping("/map")
    public Map<Integer, String> getMapping(){
        List<Message> messageList = new ArrayList<>();
        messageList.add(new Message(200,"정상응답"));
        messageList.add(new Message(404,"페이지를 찾을 수 없습니다"));
        messageList.add(new Message(200,"개발자의 잘못입니다."));

        return messageList.stream()
                .collect(Collectors.toMap(Message::getHttpStatusCode, Message::getMessage));
    }

    /* 설명. 이미지 응답하기 */
    /* 1. byte[] 방식: Files.readAllBytes() -> 파일 시스템에서 매번 직접 읽기
     * 2. WebConfig 방식:
     * 3. Resource 방식:
    * */
    /* 설명. 1. byte[] */
    @GetMapping(value="/image/bytes/{filename}", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImageWithBytes(@PathVariable String filename) throws IOException {
        Path path = Paths.get("C:/uploadFiles/img/single/" + filename + ".png");
        byte[] imageData = Files.readAllBytes(path);
        return imageData;
    }
}