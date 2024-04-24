package com.example.sampleapp.application.service;

import com.example.sampleapp.application.port.in.CRUDTenantUseCase;
import com.example.sampleapp.application.port.out.UpdateTenantPort;
import com.example.sampleapp.common.UseCase;
import com.example.sampleapp.domain.Tenant;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@UseCase
public class CRUDTenantService implements CRUDTenantUseCase {
    private final UpdateTenantPort updateTenantPort ;

    @Override
    public UUID createTenant(String name) {
        Tenant tenant = new Tenant(UUID.randomUUID(), name);
        updateTenantPort.save(tenant);
        return tenant.getId();
    }

    @Override
    public List<Tenant> getTenants() {
        return updateTenantPort.findAll();
    }
}
