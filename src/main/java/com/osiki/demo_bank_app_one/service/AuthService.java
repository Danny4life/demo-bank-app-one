package com.osiki.demo_bank_app_one.service;

import com.osiki.demo_bank_app_one.payload.request.LoginRequest;
import com.osiki.demo_bank_app_one.payload.request.UserRequest;
import com.osiki.demo_bank_app_one.payload.response.APIResponse;
import com.osiki.demo_bank_app_one.payload.response.BankResponse;
import com.osiki.demo_bank_app_one.payload.response.JwtAuthResponse;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    BankResponse registerUser(UserRequest userRequest);
    ResponseEntity<APIResponse<JwtAuthResponse>> login(LoginRequest loginRequest);
}
