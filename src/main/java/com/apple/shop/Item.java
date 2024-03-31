package com.apple.shop;

import jakarta.persistence.*;

@Entity //엔티티를 붙이면 java파일로 클래스를 생성하면 Table을 생성할 수 있다.
public class Item { //관계형 데이터베이스들은 테이블을 만들 때 컬럼도 꼭 만들어줘야한다.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //데이터가 늘어날 수록 1씩 증가해달라는 명령어.
    public Integer id; //프라이머리 키에는 항상 @Id 를 붙여야한다.

    //@Column(nullable = false, columnDefinition = "TEXT") //이 컬럼이 비어있으면 테이블에 입력을 막아주세요. //숫자 제한 없는 TEXT 형식
    public String title;
    //@Column(unique = true, length = 1000) //서로 다른 값만 저장하게 해주세요. // 1000자 까지 입력가능.
    public Integer price; //컬럼용 변수는 int 말고 Integer를 쓴다.


    public String toString() {
        return this.id + this.title + this.price;
    }
}
