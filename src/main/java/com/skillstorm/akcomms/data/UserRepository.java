package com.skillstorm.akcomms.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.akcomms.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
