package com.twiddit.searchengine.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Trend {
    private String idTwiddit;
    private Date dateTrends;
    private String tags;
}
