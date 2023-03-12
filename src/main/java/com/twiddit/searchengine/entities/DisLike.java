package com.twiddit.searchengine.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DisLike {

    private String idDislike;
    private String userId;
    private Date creationDate;
    private String twidditId;
}
