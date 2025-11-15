package com.ecocampusGroup.ecocampus.Model.MySQL.Repositiory;

import com.ecocampusGroup.ecocampus.Model.MySQL.Entities.LeaderBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Long> {
}