package com.capgemini.InvoiceCalculator_46007582.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.InvoiceCalculator_46007582.bean.InVoice;
import com.capgemini.InvoiceCalculator_46007582.exception.InvoiceNotFoundException;

public interface InVoiceServiceInterface {
	public List<InVoice> getAllInVoices();
	public Optional<InVoice> getInVoice(int id) throws InvoiceNotFoundException;
	public void addInVoice(InVoice invoice) throws InvoiceNotFoundException;
	public void delete(int id)throws InvoiceNotFoundException;
	public void update(String id,InVoice invoice);
	public InVoice calculate(InVoice invoice);
}
