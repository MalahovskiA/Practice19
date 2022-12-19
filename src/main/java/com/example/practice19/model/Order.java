package com.example.practice19.model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor

public class Order {
    private Long id;
    private String pizzaName;
    private Integer pizzaCount;
    private List<Invite> invites;

}
