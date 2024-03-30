package com.apple.shop; //이 클래스를 다른 파일에서도 쓰고싶으면
//경로를 패키지로 적어둬야한다.
//com/apple/shop/ItemController.java

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor //Lombok 문법이다.
public class ItemController {

    private final ItemRepository itemRepository;

    /*
    private final ItemRepository itemRepository;
    @Autowired //lombok없이 등록하는 법
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    */

    @GetMapping("/list")
    String list(Model model){

        List<Item> result = itemRepository.findAll(); //Item Object형태로 가져온다.
        System.out.println(result.get(0).title);
        System.out.println(result.get(0).price);

        //List<Object> a = new ArrayList<>();

        model.addAttribute("name","청바지");
        //model.addAttribute()
        return "list.html";
    }
}
