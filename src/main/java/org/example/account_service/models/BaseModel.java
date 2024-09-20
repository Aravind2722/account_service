package org.example.account_service.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isDeleted;

    @PrePersist
    public void onCreate() {
        Date curDateTime = new Date();
        this.setCreatedAt(curDateTime);
        this.setUpdatedAt(curDateTime);
        this.setIsDeleted(false);
    }

    @PreUpdate
    public void onUpdate() {
        this.setUpdatedAt(new Date());
    }
}
