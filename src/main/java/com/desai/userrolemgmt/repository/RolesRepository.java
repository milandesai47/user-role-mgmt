package com.desai.userrolemgmt.repository;


import com.desai.userrolemgmt.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

    Roles findRoleByRoleName(String roleName);

    Roles findRolesById(Long id);

    List<Roles> findRolesByRoleMapping(String roleMapping);
}
