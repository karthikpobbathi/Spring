package com.capgemini.SpringExam.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.SpringExam.model.FacultyDetails;

public interface FacultyRepository extends CrudRepository<FacultyDetails, String> {

}
