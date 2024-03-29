package com.apple.shop; //이 클래스를 다른 파일에서도 쓰고싶으면
//경로를 패키지로 적어둬야한다.
//com/apple/shop/ItemController.java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @GetMapping("/list")
    String list(Model model){
        model.addAttribute("name","청바지");
        //model.addAttribute()
        return "list.html";
    }
}
