package com.example.sampleapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class Tenant {
    private UUID id;
    private String name;
}
