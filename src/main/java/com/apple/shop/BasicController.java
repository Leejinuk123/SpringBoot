package com.apple.shop;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //자동완성하면 위에 import가 자동으로 된다.
//아무 클래스에 Controller만 붙이면 main함수에서 가져와준다.
public class BasicController {
    @GetMapping("/") //메인페이지로 접속하면
    //@ResponseBody 이걸 붙이면 문자데이터를 보내달라는 뜻이 된다. 빼면 html파일이 그대로 간다.
    String hello(){ //함수 실행
        return "index.html";
    }

    @GetMapping("/about") //메인페이지로 접속하면
    @ResponseBody
    String about(){ //함수 실행
        return "이진욱입니다.";
    }

    @GetMapping("/date") //메인페이지로 접속하면
    @ResponseBody
    String date(){ //함수 실행
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " + currentDateTime);
        return "현재 날짜와 시간:" + currentDateTime; //흠~

    }

}
