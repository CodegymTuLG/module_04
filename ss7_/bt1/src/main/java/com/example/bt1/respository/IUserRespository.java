package com.example.bt1.respository;

import com.example.bt1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRespository extends JpaRepository<User, Integer> {

}
