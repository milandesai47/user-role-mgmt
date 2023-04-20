package com.desai.userrolemgmt.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public record Users(@Id Long id, String userId, String username, String email) {
}
