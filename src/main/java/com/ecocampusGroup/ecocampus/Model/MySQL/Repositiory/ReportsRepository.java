package com.ecocampusGroup.ecocampus.Model.MySQL.Repositiory;

import com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Reports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsRepository extends JpaRepository<Reports, Long> {
}