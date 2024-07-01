package com.osiki.demo_bank_app_one.infrastructure.controller;

import com.osiki.demo_bank_app_one.payload.request.LoginRequest;
import com.osiki.demo_bank_app_one.payload.request.UserRequest;
import com.osiki.demo_bank_app_one.payload.response.APIResponse;
import com.osiki.demo_bank_app_one.payload.response.BankResponse;
import com.osiki.demo_bank_app_one.payload.response.JwtAuthResponse;
import com.osiki.demo_bank_app_one.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth/")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("register-user")
    public BankResponse createAccount(@Valid @RequestBody UserRequest userRequest){
        return authService.registerUser(userRequest);
    }

    @PostMapping("login-user")
    public ResponseEntity<APIResponse<JwtAuthResponse>> login(@Valid @RequestBody LoginRequest loginRequest){
        return authService.login(loginRequest);
    }

}
