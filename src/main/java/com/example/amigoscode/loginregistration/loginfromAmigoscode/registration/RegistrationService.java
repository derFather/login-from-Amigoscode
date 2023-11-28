package com.example.amigoscode.loginregistration.loginfromAmigoscode.registration;

import com.example.amigoscode.loginregistration.loginfromAmigoscode.appuser.AppUser;
import com.example.amigoscode.loginregistration.loginfromAmigoscode.appuser.AppUserRole;
import com.example.amigoscode.loginregistration.loginfromAmigoscode.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    public String register(RegistrationRequest request) {
        return "it works";
    }
}
