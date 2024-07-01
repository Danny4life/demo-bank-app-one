package com.osiki.demo_bank_app_one.domain.entity;

import com.osiki.demo_bank_app_one.domain.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users_tbl")
public class UserEntity extends BaseClass{
    private String firstName;
    private String lastName;
    private String otherName;
    private String email;
    private String password;
    private String gender;
    private String address;
    private String stateOfOrigin;
    private String accountNumber;
    private String bankName;
    private BigDecimal accountBalance;
    private String phoneNumber;
    private String profilePicture;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String status;
}
