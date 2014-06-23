package com.example.switchyard.demo;

import static javax.jws.soap.SOAPBinding.Style.DOCUMENT;
import static javax.jws.soap.SOAPBinding.Use.LITERAL;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.switchyard.component.bean.Service;


public interface BeanService {

		// TODO Auto-generated constructor stub
		
		void getEmployee();

		void searchEmployee();
		
		void searchAndGetEmployee() ;

}
