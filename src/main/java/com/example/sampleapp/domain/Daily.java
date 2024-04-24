package com.example.sampleapp.domain;

import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
public class Daily {
    private UUID tenantId;
    private Date date;

}
