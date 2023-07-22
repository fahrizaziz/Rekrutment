package com.source.code.rekrutment.Payload.Response;

import lombok.Data;

@Data
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id_user;
    private String username;
    private String email;

    public JwtResponse(String accessToken, Long id_user, String username, String email) {
        this.token = accessToken;
        this.id_user = id_user;
        this.username = username;
        this.email = email;
    }
}
