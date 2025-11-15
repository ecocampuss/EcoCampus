package com.ecocampusGroup.ecocampus.Model.NoSQL.Repositiory;

import com.ecocampusGroup.ecocampus.Model.NoSQL.Collections.EnergyLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyLogRepository extends MongoRepository<EnergyLog,String> {
}
