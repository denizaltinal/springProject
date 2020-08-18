package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {

	@Query(value="Select * from User where user_name=?1 and password=?2", nativeQuery=true)
	User getUser(String userName, String password);
}
