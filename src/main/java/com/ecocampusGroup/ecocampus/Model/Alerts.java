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


}
