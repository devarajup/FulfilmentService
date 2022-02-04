package com.cjss.FulfilmentService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusUpdate {
    private  String itemCode;
    private String itemStatus;
}
