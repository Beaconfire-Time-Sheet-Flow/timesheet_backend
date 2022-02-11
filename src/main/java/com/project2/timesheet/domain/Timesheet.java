package com.project2.timesheet.domain;

import com.project2.timesheet.domain.Daysheet;
import lombok.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

import com.querydsl.core.annotations.QueryEntity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@QueryEntity
@Document(collection = "weeksheet")
public class Timesheet {

    @Id
    private String id;

    private int userId;
    private List<Daysheet> days;
    private List<Weeksheet> weeks;



}
