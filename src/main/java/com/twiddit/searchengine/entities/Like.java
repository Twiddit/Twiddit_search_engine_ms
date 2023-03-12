package com.twiddit.searchengine.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Like {

    private String idLike;
    private String userId;
    private Date creationDate;
    private String twidditId;
}
