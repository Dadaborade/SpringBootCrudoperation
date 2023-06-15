package com.cjc.crud.webapp.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.webapp.main.model.Student;
import com.cjc.crud.webapp.main.repository.HomeRepository;
import com.cjc.crud.webapp.main.service.HomeService;

@Service
public class HomeServiceImpl  implements HomeService{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Student s) 
	{
		
		hr.save(s);
		
	}

}
