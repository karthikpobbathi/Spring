package com.capgemini.InvoiceCalculator_46007582.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.InvoiceCalculator_46007582.bean.InVoice;
import com.capgemini.InvoiceCalculator_46007582.exception.InvoiceNotFoundException;
import com.capgemini.InvoiceCalculator_46007582.repository.InVoiceRepository;

@Service  
public class InVoiceService implements InVoiceServiceInterface {  
	@Autowired  
	private InVoiceRepository invoiceRepository;  
//used to get all the records
	public List<InVoice> getAllInVoices(){  
		List<InVoice>invoice  = new ArrayList<>(); 

		invoiceRepository.findAll().forEach(invoice ::add);  
		return invoice ;  
	}  
	
	//used to get single invoice
	public Optional<InVoice> getInVoice(int id) {  
		
		return invoiceRepository.findById(id);  
	}  
	
	//used to add invoice
	public void addInVoice(InVoice invoice) throws InvoiceNotFoundException{ 
		if(invoice.getDistance()<100) {
			InVoice inv=calculate(invoice);
			invoiceRepository.save(inv); 
		}
		else
		{
			throw new InvoiceNotFoundException("distance should be less than 100");
		}

	}  
	
	//used to delete
	public void delete(int id){  
		
		invoiceRepository.deleteById(id);
	} 
	
	//used to update
	public void update(String id,InVoice invoice) {
		InVoice inv=calculate(invoice);
		invoiceRepository.save(invoice);
	}
	
	//used to calculate
	public InVoice calculate(InVoice invoice)
	{
		int charge = 5*invoice.getDistance()*invoice.getWeight();
		double cgst = charge * (3.5/100);
		double sgst = charge * (3.5/100);
		double total = charge+cgst+sgst;
		invoice.setAmount(total);
		return invoice;

	}
}  
