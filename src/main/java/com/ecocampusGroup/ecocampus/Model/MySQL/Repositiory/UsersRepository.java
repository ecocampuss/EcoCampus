package com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Repositiory;

import com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}