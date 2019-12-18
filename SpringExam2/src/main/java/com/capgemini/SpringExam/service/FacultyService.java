package com.capgemini.SpringExam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.SpringExam.model.FacultyDetails;
import com.capgemini.SpringExam.repository.FacultyRepository;

@Service  
public class FacultyService {  
    @Autowired  
    private FacultyRepository facultyRepository;  
    public List<FacultyDetails> getAllFacultys(){  
        List<FacultyDetails>faculty  = new ArrayList<>();  
        facultyRepository.findAll().forEach(faculty ::add);  
        return faculty ;  
    }  
    public Optional<FacultyDetails> getFaculty(String id){  
        return facultyRepository.findById(id);  
    }  
    public void addFaculty(FacultyDetails faculty){  
        facultyRepository.save(faculty);  
    }  
    public void delete(String id){  
        facultyRepository.deleteById(id);
    } 
    public void update(String id,FacultyDetails faculty) {
    	
    	 facultyRepository.save(faculty);
    }
}  

