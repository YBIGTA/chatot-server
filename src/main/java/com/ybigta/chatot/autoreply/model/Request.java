package com.ybigta.chatot.autoreply.model;

import lombok.Data;

@Data
public class Request {
    private String userKey;
    private String type;
    private String content;
}
