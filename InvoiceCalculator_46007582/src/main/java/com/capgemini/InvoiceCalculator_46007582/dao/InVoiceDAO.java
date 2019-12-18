package com.capgemini.InvoiceCalculator_46007582.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.InvoiceCalculator_46007582.bean.InVoice;
import com.capgemini.InvoiceCalculator_46007582.service.InVoiceService;



@RestController 
public class InVoiceDAO {
	@Autowired  
	private InVoiceService inVoiceService;   
	@RequestMapping("/")  
	public List<InVoice> getAllInVoice(){  
		return inVoiceService.getAllInVoices();  
	}     

	@RequestMapping(value="/add-invoice", method=RequestMethod.POST)  
	public void addInVoice(@RequestBody InVoice invoiceRecord){  
		inVoiceService.addInVoice(invoiceRecord);  
	}  
	@RequestMapping(value="/invoice/{id}", method=RequestMethod.GET)  
	public Optional<InVoice> getInVoice(@PathVariable int id){  
		return inVoiceService.getInVoice(id);  
	} 
	@RequestMapping(value="/invoice/{id}", method=RequestMethod.DELETE)  
	public void deleteInVoice(@PathVariable int id){  
		inVoiceService.delete(id);  
	} 
	@RequestMapping(value="/invoice/{id}", method=RequestMethod.PUT)  
	public void updateInVoice(@PathVariable String id,@RequestBody InVoice invoiceRecord){  
		inVoiceService.update(id,invoiceRecord);  
	}
}
