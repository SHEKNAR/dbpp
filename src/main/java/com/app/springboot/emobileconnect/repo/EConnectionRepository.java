package com.app.springboot.emobileconnect.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.emobileconnect.model.EMConnection;

public interface EConnectionRepository extends JpaRepository<EMConnection, Long> {
	
	
	List<EMConnection> findByPublished(boolean published);

	List<EMConnection> findByTitleContaining(String title);
}
