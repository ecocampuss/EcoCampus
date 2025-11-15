package com.ecocampusGroup.ecocampus.Model.NoSQL;


import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "device_health")
public class DeviceHealth {
    @Id
    private String id;

    private String device_id;
    private double temperature;
    private int soc_percent;
    private int cycle_count;
    private String status;
    private Instant timestamp;

    public DeviceHealth() {
    }
}
