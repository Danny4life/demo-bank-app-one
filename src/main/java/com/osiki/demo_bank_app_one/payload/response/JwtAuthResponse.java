package com.osiki.demo_bank_app_one.payload.response;

import com.osiki.demo_bank_app_one.domain.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtAuthResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String profilePicture;
    private String email;
    private String gender;
    private Role role;
    private String accessToken;
    private String tokenType = "Bearer";
}
