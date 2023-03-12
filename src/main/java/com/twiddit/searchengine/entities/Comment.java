package com.twiddit.searchengine.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {

    private String idComment;
    private String text;
    private Date threadId;
    private String userId;
    private String twidditId;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String video;
}
