package com.capgemini.SpringExam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.SpringExam.model.FacultyDetails;
import com.capgemini.SpringExam.service.FacultyService;

@RestController 
public class FacultyController {
	 @Autowired  
	    private FacultyService facultyService;   
	    @RequestMapping("/fal")  
	    public List<FacultyDetails> getAllFaculty(){  
	        return facultyService.getAllFacultys();  
	    }     

	    @RequestMapping(value="/add-faculty", method=RequestMethod.POST)  
	    public void addFaculty(@RequestBody FacultyDetails facultyRecord){  
	        facultyService.addFaculty(facultyRecord);  
	    }  
	  @RequestMapping(value="/faculty/{id}", method=RequestMethod.GET)  
	    public Optional<FacultyDetails> getFaculty(@PathVariable String id){  
	        return facultyService.getFaculty(id);  
	    } 
	  @RequestMapping(value="/faculty/{id}", method=RequestMethod.DELETE)  
	  public void deleteFaculty(@PathVariable String id){  
	      facultyService.delete(id);  
	  } 
	  @RequestMapping(value="/faculty/{id}", method=RequestMethod.PUT)  
	  public void updateFaculty(@PathVariable String id,@RequestBody FacultyDetails facultyRecord){  
	      facultyService.update(id,facultyRecord);  
	  }
}

