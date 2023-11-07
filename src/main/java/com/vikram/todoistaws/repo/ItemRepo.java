package com.vikram.todoistaws.repo;

import com.vikram.todoistaws.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,Long> {
}
