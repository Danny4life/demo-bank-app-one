package com.osiki.demo_bank_app_one.service;

import com.osiki.demo_bank_app_one.payload.response.BankResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface GeneralUserService {
    ResponseEntity<BankResponse<String>> uploadProfilePics(Long userId, MultipartFile multipartFile);

}
