package com.ecocampusGroup.ecocampus.Model.MySQL.Entities;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
public class Reports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String campus;

    private Double total_generation;

    private Double total_consumption;

    private Double renewable_percent;

    private Double Co2_Saved;

    @CreationTimestamp
    private Date created_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Double getTotal_generation() {
        return total_generation;
    }

    public void setTotal_generation(Double total_generation) {
        this.total_generation = total_generation;
    }

    public Double getTotal_consumption() {
        return total_consumption;
    }

    public void setTotal_consumption(Double total_consumption) {
        this.total_consumption = total_consumption;
    }

    public Double getRenewable_percent() {
        return renewable_percent;
    }

    public void setRenewable_percent(Double renewable_percent) {
        this.renewable_percent = renewable_percent;
    }

    public Double getCo2_Saved() {
        return Co2_Saved;
    }

    public void setCo2_Saved(Double co2_Saved) {
        Co2_Saved = co2_Saved;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Reports(Long id, String campus, Double total_generation, Double total_consumption, Double renewable_percent, Double co2_Saved, Date created_at) {
        this.id = id;
        this.campus = campus;
        this.total_generation = total_generation;
        this.total_consumption = total_consumption;
        this.renewable_percent = renewable_percent;
        Co2_Saved = co2_Saved;
        this.created_at = created_at;
    }

    public Reports() {
    }
}
