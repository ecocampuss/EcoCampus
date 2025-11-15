package com.ecocampusGroup.ecocampus.Model.NoSQL.Collections;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;


@Document(collection = "energy_logs")
public class EnergyLog {
    @Id
    private String id;

    private String device_id;
    private String type;
    private double voltage;
    private double current;
    private double power_kw;
    private Instant timestamp;

    public EnergyLog() {
    }
}
