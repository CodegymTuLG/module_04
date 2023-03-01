package com.example.bt.repository;

import com.example.bt.model.RentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentHistoryRepository extends JpaRepository<RentHistory, Integer> {
}
