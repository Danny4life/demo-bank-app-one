package com.osiki.demo_bank_app_one.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailRequest {
    private String recipient;
    private String messageBody;

    private String attachment;

    private String subject;
}
