package com.ecocampusGroup.ecocampus.Repositiory;

import com.ecocampusGroup.ecocampus.Model.LeaderBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Long> {
}