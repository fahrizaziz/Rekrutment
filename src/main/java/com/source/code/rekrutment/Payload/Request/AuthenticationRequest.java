package com.source.code.rekrutment.Payload.Request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AuthenticationRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
