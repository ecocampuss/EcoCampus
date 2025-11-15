package com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Repositiory;

import com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Devices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevicesRepository extends JpaRepository<Devices, Long> {
}