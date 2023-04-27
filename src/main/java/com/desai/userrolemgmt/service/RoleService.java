package com.desai.userrolemgmt.service;

import com.desai.userrolemgmt.model.Roles;
import com.desai.userrolemgmt.repository.RolesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    private final RolesRepository rolesRepository;

    public RoleService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public Roles getRoleByRoleName(String roleName) {
        return rolesRepository.findRoleByRoleName(roleName);
    }

    public List<Roles> getAllRoles() {
        return rolesRepository.findAll();
    }

    public List<Roles> getRoleByRoleMapping(String roleMapping) {
        return rolesRepository.findRolesByRoleMapping(roleMapping);
    }
}
