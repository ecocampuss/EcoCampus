package com.ecocampusGroup.ecocampus.Model.MySQL.Entities.Repositiory;

import com.ecocampusGroup.ecocampus.Model.MySQL.Entities.LeaderBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Long> {
}