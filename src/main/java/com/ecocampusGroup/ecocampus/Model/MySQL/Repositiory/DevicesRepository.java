package com.ecocampusGroup.ecocampus.Model.MySQL.Repositiory;

import com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Devices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicesRepository extends JpaRepository<Devices, Long> {
}