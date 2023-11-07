package com.vikram.todoistaws.repo;

import com.vikram.todoistaws.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<Tasks,String> {
}
