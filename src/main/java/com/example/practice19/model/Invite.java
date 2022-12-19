package com.example.practice19.model;

import com.example.practice19.conroller.InviteType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data

public class Invite {
    private Long id;
    private InviteType type;
    private String name;
    private Integer count;

    public Invite(Long id, InviteType type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }
}
