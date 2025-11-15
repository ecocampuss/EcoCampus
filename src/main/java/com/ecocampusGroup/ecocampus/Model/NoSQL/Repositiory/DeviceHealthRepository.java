package com.ecocampusGroup.ecocampus.Repositiory;

import com.ecocampusGroup.ecocampus.Model.DeviceHealth;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceHealthRepository extends MongoRepository<DeviceHealth,String> {
}
