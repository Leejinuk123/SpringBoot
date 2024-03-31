package com.apple.shop;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    //Jpa라이브러리 사용법이니 외울 필요는 없다.
    //JpaRepository에 db입출력 관한 메소드들이 다 정의되어 있다.
    //이를 인터페이스로 만들어서 원하는 클래스에서 사용한다.
}

