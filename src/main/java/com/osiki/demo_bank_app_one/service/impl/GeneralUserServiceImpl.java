package com.osiki.demo_bank_app_one.service.impl;

import com.osiki.demo_bank_app_one.domain.entity.UserEntity;
import com.osiki.demo_bank_app_one.payload.response.BankResponse;
import com.osiki.demo_bank_app_one.repository.UserRepository;
import com.osiki.demo_bank_app_one.service.GeneralUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GeneralUserServiceImpl implements GeneralUserService {
    private final FileUploadServiceImpl fileUpload;
    private final UserRepository userRepository;
    @Override
    public ResponseEntity<BankResponse<String>> uploadProfilePics(Long userId, MultipartFile profilePics) {

        Optional<UserEntity> user = userRepository.findById(userId);

        String fileUrl = null;

        try{
            if(user.isPresent()){
                fileUrl = fileUpload.uploadFile(profilePics);

                UserEntity userEntity = user.get();
                userEntity.setProfilePicture(fileUrl);

                userRepository.save(userEntity);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(
                new BankResponse<>(
                        "Uploaded Successfully",
                        fileUrl
                )
        );
    }
}
