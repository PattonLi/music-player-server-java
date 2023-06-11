package com.example.webmusic.controller.user.out.AdminUser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OutApi_adminLogin {
    int code;
    String token;
    int adminId;
}
