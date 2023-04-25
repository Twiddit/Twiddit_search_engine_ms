package com.twiddit.searchengine.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("twiddits")
public class Twiddit {
    @Id
    private String idTwiddit;
    private String text;
   // private Date creationDate;
    private int userId;
    @Field(name = "communidditsId")
    private String idCommuniddits;
    private String retwidditId;
    @Field(name = "imageURL1")
    private String image1;
    @Field(name = "imageURL2")
    private String image2;
    @Field(name = "imageURL3")
    private String image3;
    @Field(name = "imageURL4")
    private String image4;
    @Field(name = "videoURL")
    private String video;
    private String[] tags;

}
