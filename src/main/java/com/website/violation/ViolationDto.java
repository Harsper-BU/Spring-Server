package com.website.violation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter@Setter@ToString
public class ViolationDto {
    private String deviceId;
    private int totalDetection;
    private int noHelmetCount;
    private String image;
}
