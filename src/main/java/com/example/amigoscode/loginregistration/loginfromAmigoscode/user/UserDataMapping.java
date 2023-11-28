package com.example.amigoscode.loginregistration.loginfromAmigoscode.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class UserDataMapping {

    private List<UserDTO> data;
}
