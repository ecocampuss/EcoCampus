package com.ecocampusGroup.ecocampus.Model.MySQL.Repositiory;

import com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Alerts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlertsRepository extends JpaRepository<Alerts, Long> {

}