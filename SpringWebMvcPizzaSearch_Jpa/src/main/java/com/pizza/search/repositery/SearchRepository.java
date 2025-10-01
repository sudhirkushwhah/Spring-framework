package com.pizza.search.repositery;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pizza.search.entity.Pizza;


@Repository
public interface SearchRepository extends CrudRepository<Pizza, Long> {

	public Optional<Pizza> findByid(Long searchString);
	

}
