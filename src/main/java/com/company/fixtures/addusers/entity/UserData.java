package com.company.fixtures.addusers.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserData {

    private String userRole;
    private String employeeName;
    private String userName;
    private String status;
    private String password;

}
