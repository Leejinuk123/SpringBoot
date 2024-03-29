package com.apple.shop;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Notice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(columnDefinition = "TEXT")
    public String title;
    Date date;
}
