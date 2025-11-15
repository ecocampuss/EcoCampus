package com.ecocampusGroup.ecocampus.Repositiory;

import com.ecocampusGroup.ecocampus.Model.EnergyLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnergyLogRepository extends MongoRepository<EnergyLog,String> {
}
