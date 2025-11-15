package com.ecocampusGroup.ecocampus.Model.MySQL.Entities;


import com.ecocampusGroup.ecocampus.Model.Enums.Status;
import com.ecocampusGroup.ecocampus.Model.Enums.Type;
import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Devices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "device_id", unique = true, nullable = false, length = 50)
    private String deviceId;

    @Column(nullable = false, length = 100)
    private String name;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(length = 100)
    private String location;

    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    @UpdateTimestamp
    private LocalDateTime lastUpdated;


    @OneToMany(mappedBy = "devices", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alerts> alerts;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<Alerts> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alerts> alerts) {
        this.alerts = alerts;
    }

    public Devices(Long id, String deviceId, String name, Type type, String location, Status status, LocalDateTime lastUpdated, List<Alerts> alerts) {
        this.id = id;
        this.deviceId = deviceId;
        this.name = name;
        this.type = type;
        this.location = location;
        this.status = status;
        this.lastUpdated = lastUpdated;
        this.alerts = alerts;
    }

    public Devices() {
    }
}
