package com.example.demo.modelo.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.entity.Patron;
@Repository
public interface PatronRepository extends JpaRepository<Patron, Integer> {

}
