package com.apple.shop;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    //Jpa라이브러리 사용법이니 외울 필요는 없다.

}

