package com.example.sampleapp.adapter.in.web;

import com.example.sampleapp.application.port.in.CRUDTenantUseCase;
import com.example.sampleapp.domain.Tenant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class TenantController {
    private final CRUDTenantUseCase crudTenantUseCase;

    @PostMapping("/tenant/{tenantName}")
    UUID createTenant(@PathVariable("tenantName") String tenantName){
        return crudTenantUseCase.createTenant(tenantName);
    }

    @GetMapping("/tenant")
    List<Tenant> getTenants(){
        return crudTenantUseCase.getTenants();
    }


}
