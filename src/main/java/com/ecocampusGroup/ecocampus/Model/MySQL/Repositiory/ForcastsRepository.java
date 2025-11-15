package com.ecocampusGroup.ecocampus.Model.MySQL.Repositiory;

import com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Forcasts;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForcastsRepository extends JpaRepository<Forcasts,Long> {
}
