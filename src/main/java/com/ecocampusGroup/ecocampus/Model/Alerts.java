package com.ecocampusGroup.ecocampus.Model;

import com.ecocampusGroup.ecocampus.Model.Enums.Level;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


@Entity
public class Alerts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String type;

    @Column(columnDefinition = "TEXT")
    private String message;


    @Enumerated(EnumType.STRING)
    private Level level;

    @CreationTimestamp
    private LocalDateTime created_at;

    private Boolean resolved = false;


    @ManyToOne
    @JoinColumn(name = "device_id")
    private Devices devices;


    public Alerts(Long id, String type, String message, Level level, LocalDateTime created_at, Boolean resolved, Devices devices) {
        this.id = id;
        this.type = type;
        this.message = message;
        this.level = level;
        this.created_at = created_at;
        this.resolved = resolved;
        this.devices = devices;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public Boolean getResolved() {
        return resolved;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    public Devices getDevices() {
        return devices;
    }

    public void setDevices(Devices devices) {
        this.devices = devices;
    }
}
