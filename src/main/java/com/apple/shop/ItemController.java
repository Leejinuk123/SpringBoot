package com.apple.shop; //이 클래스를 다른 파일에서도 쓰고싶으면
//경로를 패키지로 적어둬야한다.
//com/apple/shop/ItemController.java

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequiredArgsConstructor //Lombok 문법이다.
public class ItemController {



    /*
    private final ItemRepository itemRepository;
    @Autowired //lombok없이 등록하는 법
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    */
    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String list(Model model){

        List<Item> result = itemRepository.findAll(); //Item Object형태로 가져온다.
        //List<Object> a = new ArrayList<>();

        model.addAttribute("items",result);

        //model.addAttribute()
        return "list.html";
    }

    @GetMapping("/write")
    String write(){
        return "write.html";
    }

    @PostMapping("/add") //작명시 명사로 작명하는게 좋음
    String addPost(@RequestParam String title, //ajax로 post를 요청하면 Param이 아니라 body를 해야한다.
                   @RequestParam Integer price){
        Item item = new Item();
        item.price = price;
        item.title = title;
        itemRepository.save(item);
        return "redirect:/list";
    }
}
