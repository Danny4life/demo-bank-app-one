package com.osiki.demo_bank_app_one.infrastructure.controller;

import com.osiki.demo_bank_app_one.payload.response.BankResponse;
import com.osiki.demo_bank_app_one.service.GeneralUserService;
import com.osiki.demo_bank_app_one.utils.AppConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class GeneralUserController {
    private final GeneralUserService generalUserService;

    @PutMapping("profile-picture/{id}")
    public ResponseEntity<BankResponse<String>> profilePicsUpload(@PathVariable("id") Long id,
                                                                  @RequestParam MultipartFile profilePic){
        if(profilePic.getSize() > AppConstants.MAX_FILE_SIZE){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new BankResponse<>("FIle size exceed the normal limit"));

        }

       // String token = authenticationFilter.getTokenFromRequest(request);
        //String userEmail = jwtTokenProvider.getUsername(token);

       // evictProfilePicCache(userEmail);

        return generalUserService.uploadProfilePics(id, profilePic);
    }
}
