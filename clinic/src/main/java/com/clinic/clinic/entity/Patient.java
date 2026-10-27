package com.clinic.clinic.entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String cnp;
    private String email;
    private String birthDate;
    //ce tine de sanatate e pus separat in fisa pacientului ( are acc id ca pacientul )
}
