package com.ecocampusGroup.ecocampus.Model.NoSQL.Repositiory;

import com.ecocampusGroup.ecocampus.Model.NoSQL.Collections.DeviceHealth;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceHealthRepository extends MongoRepository<DeviceHealth,String> {
}
