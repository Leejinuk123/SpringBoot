package com.apple.shop;

import jakarta.persistence.*;
import lombok.ToString;

import java.util.Date;

@Entity
@ToString
public class Notice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(columnDefinition = "TEXT")
    public String title;
    public Date date;
}
