package com.diner.tbrm.restaurante.diner.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AccountDinerRequestDTO {
    @NotNull
    private Long id;
    @NotNull
    private Long dinerId;
    @NotNull
    private Integer age;
    @NotBlank
    private String name;
    @NotBlank
    private String phone;
    @NotBlank
    private String address;

}

