package com.wildcodeschool.wildandwizard.repository;

// TODO : update this interface
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.Wizard;  

@Repository
public interface SchoolRepository extends JpaRepository<Wizard, Long>  {
}
