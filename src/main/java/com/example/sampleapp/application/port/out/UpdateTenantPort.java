package com.example.sampleapp.application.port.out;

import com.example.sampleapp.domain.Tenant;

import java.util.List;
import java.util.UUID;

public interface UpdateTenantPort {
    UUID save(Tenant tenant);
    List<Tenant> findAll();
}
