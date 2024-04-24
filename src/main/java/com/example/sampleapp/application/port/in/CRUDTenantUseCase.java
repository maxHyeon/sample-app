package com.example.sampleapp.application.port.in;


import com.example.sampleapp.domain.Tenant;

import java.util.List;
import java.util.UUID;

public interface CRUDTenantUseCase {
    UUID createTenant(String name);

    List<Tenant> getTenants();
}
