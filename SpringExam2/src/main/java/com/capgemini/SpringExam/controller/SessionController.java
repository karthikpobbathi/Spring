package com.capgemini.SpringExam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.SpringExam.model.SessionDetails;
import com.capgemini.SpringExam.service.SessionService;


@RestController 
public class SessionController {
	 @Autowired  
	    private SessionService sessionService;   
	    @RequestMapping("/")  
	    public List<SessionDetails> getAllSession(){  
	        return sessionService.getAllSessions();  
	    }     

	    @RequestMapping(value="/add-session/{id}", method=RequestMethod.POST)  
	    public void addSession(@RequestBody SessionDetails sessionRecord,@PathVariable String id){  
	        sessionService.addSession(sessionRecord,id);  
	    }  
	  @RequestMapping(value="/session/{id}", method=RequestMethod.GET)  
	    public Optional<SessionDetails> getSession(@PathVariable String id){  
	        return sessionService.getSession(id);  
	    } 
	  @RequestMapping(value="/session/{id}", method=RequestMethod.DELETE)  
	  public void deleteSession(@PathVariable String id){  
	      sessionService.delete(id);  
	  } 
	  @RequestMapping(value="/session/{id}", method=RequestMethod.PUT)  
	  public void updateSession(@PathVariable String id,@RequestBody SessionDetails sessionRecord){  
	      sessionService.update(id,sessionRecord);  
	  }
}
