package com.example.sampleapp.adapter.out.persistence;

import com.example.sampleapp.application.port.out.UpdateTenantPort;
import com.example.sampleapp.common.PersistenceAdapter;
import com.example.sampleapp.domain.Tenant;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@PersistenceAdapter
public class TenantPersistenceAdapter implements UpdateTenantPort {
    private final TenantRepository tenantRepository;

    @Override
    public UUID save(Tenant tenant) {
        tenantRepository.save(TenantMapper.INSTANCE.tenantToTenantJPAEntity(tenant));
        return tenant.getId();
    }

    @Override
    public List<Tenant> findAll() {
        return TenantMapper.INSTANCE.tenantJPAEntityListTotenantList(tenantRepository.findAll());
    }
}
