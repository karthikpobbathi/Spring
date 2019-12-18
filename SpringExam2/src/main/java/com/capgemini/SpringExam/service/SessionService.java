package com.capgemini.SpringExam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.SpringExam.model.FacultyDetails;
import com.capgemini.SpringExam.model.SessionDetails;
import com.capgemini.SpringExam.repository.FacultyRepository;
import com.capgemini.SpringExam.repository.SessionRepository;


@Service  
public class SessionService {  
    @Autowired  
    private SessionRepository sessionRepository;  
    @Autowired
    private FacultyRepository facultyRepository;
    public List<SessionDetails> getAllSessions(){  
        List<SessionDetails>session  = new ArrayList<>();  
        sessionRepository.findAll().forEach(session ::add);  
        return session ;  
    }  
    public Optional<SessionDetails> getSession(String id){  
        return sessionRepository.findById(id);  
    }  
    public void addSession(SessionDetails session,String id){  
    	 List<FacultyDetails>faculty  = new ArrayList<>();  
         facultyRepository.findAll().forEach(faculty ::add); 
         FacultyDetails f=null;
         for(FacultyDetails fi:faculty){
        	if( fi.getSessionName().equals(id)) {
        		f=fi;
        	}
         }
         session.setFacultyDetails(f);
    	sessionRepository.save(session); 
       
        
        
    }  
    public void delete(String id){  
        sessionRepository.deleteById(id);
    } 
    public void update(String id,SessionDetails session) {
    	
    	 sessionRepository.save(session);
    }
}  
