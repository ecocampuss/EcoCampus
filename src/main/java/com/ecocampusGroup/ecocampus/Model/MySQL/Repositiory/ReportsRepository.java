package com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Repositiory;

import com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Reports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportsRepository extends JpaRepository<Reports, Long> {
}