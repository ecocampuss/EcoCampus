package com.ecocampusGroup.ecocampus.Model.NoSQL.Repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ForcastsData extends MongoRepository<ForcastsData,String> {
}
