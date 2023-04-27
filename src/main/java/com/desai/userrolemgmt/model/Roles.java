package com.desai.userrolemgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public record Roles(@Id Long id, String roleName, String roleDescription, String roleMapping) {
}
