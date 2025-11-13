package com.ecocampusGroup.ecocampus.Repositiory;

import com.ecocampusGroup.ecocampus.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}