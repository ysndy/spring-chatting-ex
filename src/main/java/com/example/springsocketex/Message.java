package com.example.springsocketex;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class Message {

    private String name;

    public Message(String name) {
        this.name = name;
    }
}
