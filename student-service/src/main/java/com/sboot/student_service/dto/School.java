package com.sboot.student_service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class School {
    private int id;
    private String schoolName;
    private String location;
    private String principalname;
}
