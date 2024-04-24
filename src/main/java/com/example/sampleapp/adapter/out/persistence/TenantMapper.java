package com.example.sampleapp.adapter.out.persistence;

import com.example.sampleapp.domain.Tenant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TenantMapper {
    TenantMapper INSTANCE = Mappers.getMapper( TenantMapper.class );

    TenantJpaEntity tenantToTenantJPAEntity(Tenant tenant);

    List<Tenant> tenantJPAEntityListTotenantList(List<TenantJpaEntity> tenantJpaEntityList);
}
