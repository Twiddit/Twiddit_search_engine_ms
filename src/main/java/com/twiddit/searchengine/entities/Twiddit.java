package com.twiddit.searchengine.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Twiddit {

    private String idTwiddit;
    private String text;
    private Date creationDate;
    private int userId;
    private int idCommuniddits;
    private int retwidditId;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String video;
    private String tags;
}
