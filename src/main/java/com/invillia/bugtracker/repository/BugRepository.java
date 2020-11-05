package com.invillia.bugtracker.repository;

import com.invillia.bugtracker.model.Bug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BugRepository extends JpaRepository<Bug, Long> {
    @Query("select b from Bug b where b.project.id = ?1")
    List<Bug> findBugsByProject(Long idProject);
}
