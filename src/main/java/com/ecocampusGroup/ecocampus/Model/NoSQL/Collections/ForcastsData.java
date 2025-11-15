package com.ecocampusGroup.ecocampus.Model.NoSQL;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Document(collection = "forecast_data")
public class ForcastsData {

    @Id
    private String id;

    private String source;

    private List<ForecastEntry> forecast;

    private Instant created_at;

    public ForcastsData() {
    }
}
