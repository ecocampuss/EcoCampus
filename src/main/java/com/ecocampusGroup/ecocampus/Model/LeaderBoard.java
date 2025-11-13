package com.ecocampusGroup.ecocampus.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

public class LeaderBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String department;

    private Double energy_saved_kwh;

    private Long rank_position;

    @UpdateTimestamp
    private LocalDateTime updated_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getEnergy_saved_kwh() {
        return energy_saved_kwh;
    }

    public void setEnergy_saved_kwh(Double energy_saved_kwh) {
        this.energy_saved_kwh = energy_saved_kwh;
    }

    public Long getRank_position() {
        return rank_position;
    }

    public void setRank_position(Long rank_position) {
        this.rank_position = rank_position;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public LeaderBoard(Long id, String department, Double energy_saved_kwh, Long rank_position, LocalDateTime updated_at) {
        this.id = id;
        this.department = department;
        this.energy_saved_kwh = energy_saved_kwh;
        this.rank_position = rank_position;
        this.updated_at = updated_at;
    }
}
