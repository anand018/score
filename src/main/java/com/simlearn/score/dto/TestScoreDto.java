package com.simlearn.score.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TestScoreDto {
    private String email;
    private String score;
    private String examType;
    private String courseCode;
    private String time;
}