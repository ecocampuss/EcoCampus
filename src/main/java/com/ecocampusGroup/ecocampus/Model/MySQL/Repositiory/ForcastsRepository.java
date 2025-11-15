package com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Repositiory;

import com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Forcasts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForcastsRepository extends JpaRepository<Forcasts,Long> {
}
