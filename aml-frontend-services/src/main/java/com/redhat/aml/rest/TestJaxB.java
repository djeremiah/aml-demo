package com.redhat.aml.rest;

import com.redhat.aml.model.Account;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringReader;


import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

//import org.apache.commons.lang3.StringUtils;
//import org.eclipse.persistence.jaxb.UnmarshallerProperties;
//import org.eclipse.persistence.jaxb.MarshallerProperties;

 
public class TestJaxB {

	public void AccountObjToJSON(Account acc) throws Exception{

		
	
	}
	
	public void JSONToAccount(String jsonIn) throws Exception{
	  
	
		
		
		
	}
	
	public static void main(String[] args) {
		
		TestJaxB tjb = new TestJaxB();
		 Account acc = new Account( "123",
				 "B",
				 "32",
				 "Wheeling",
				 "Anurag",
				 "Saran",
				 "M",
				 "SA",
				 "M",
				 "IL",
				 "wood creek",
				 "60090");
		// tjb.AccountObjToJSON(acc);
		 //tjb.JSONToAccount( "{\"employee\":{\"id\":1,\"name\":\"Ashraf\",\"skills\":[\"java\",\"sql\"]}}");
		
	}

}
