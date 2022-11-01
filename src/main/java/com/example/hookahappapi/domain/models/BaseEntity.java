package com.example.hookahappapi.domain.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    protected boolean enabled = true;
    @Column(updatable = false)
    protected LocalDateTime createdDateTime;
    protected LocalDateTime modifiedDateTime;
    protected LocalDateTime deletedDateTime;
}
