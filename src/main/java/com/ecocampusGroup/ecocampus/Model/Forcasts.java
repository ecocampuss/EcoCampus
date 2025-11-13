package com.ecocampusGroup.ecocampus.Model;

import com.ecocampusGroup.ecocampus.Model.Enums.Level;
import com.ecocampusGroup.ecocampus.Model.Enums.Source;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


@Entity
public class Forcasts {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Source source;

    @Column(columnDefinition = "JSON")
    private String predictedJson;

    @Column(length = 50)
    private String modelUsed;

    private Double accuracy;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public Forcasts(Long id, Source source, String predictedJson, String modelUsed, Double accuracy, LocalDateTime createdAt) {
        this.id = id;
        this.source = source;
        this.predictedJson = predictedJson;
        this.modelUsed = modelUsed;
        this.accuracy = accuracy;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getPredictedJson() {
        return predictedJson;
    }

    public void setPredictedJson(String predictedJson) {
        this.predictedJson = predictedJson;
    }

    public String getModelUsed() {
        return modelUsed;
    }

    public void setModelUsed(String modelUsed) {
        this.modelUsed = modelUsed;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
