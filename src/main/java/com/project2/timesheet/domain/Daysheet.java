package com.project2.timesheet.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Daysheet {

    private String day;
    private String date;
    private int startTime;
    private int endTime;
    private int hours;
    private boolean isFloating;
    private boolean isHoliday;
    private boolean isVacation;
}
