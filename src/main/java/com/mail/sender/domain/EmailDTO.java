package com.mail.sender.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmailDTO { // convert incoming json into object
    private String[] toUser;
    private  String subject;
    private String message;

}
