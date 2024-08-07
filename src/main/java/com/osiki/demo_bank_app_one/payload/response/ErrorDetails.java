package com.osiki.demo_bank_app_one.payload.response;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
    private String message;
    private HttpStatus status;
    private String debugMessage;
    private String dateTime;
}
