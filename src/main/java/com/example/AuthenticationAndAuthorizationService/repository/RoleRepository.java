package com.example.AuthenticationAndAuthorizationService.repository;

import com.example.AuthenticationAndAuthorizationService.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {


}
