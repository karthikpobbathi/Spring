package com.capgemini.SpringExam.repository;

import org.springframework.data.repository.CrudRepository;


import com.capgemini.SpringExam.model.SessionDetails;

public interface SessionRepository extends CrudRepository<SessionDetails, String> {

}
