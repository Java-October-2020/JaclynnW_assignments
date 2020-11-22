package com.jaclynn.beltreviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaclynn.beltreviewer.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
	List <Event> findAll();
	List <Event> findByState(String state);
	List <Event> findByStateIsNot(String state);
}
