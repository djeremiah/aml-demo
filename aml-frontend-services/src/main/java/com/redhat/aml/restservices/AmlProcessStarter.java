package com.redhat.aml.restservices;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.KieSession;
import org.kie.remote.client.api.RemoteRestRuntimeEngineFactory;
import org.kie.services.client.api.command.RemoteConfiguration;
import org.kie.services.client.api.command.RemoteRuntimeEngine;

import com.redhat.aml.domain.Account;
import com.redhat.aml.domain.Transaction;

public class AmlProcessStarter {
	
	private static final String BPMS_USER = "appadmin";
	private static final String BPMS_PASSWORD = "Pass@123";
	private static final String BPMS_HOST = "localhost:8080";
	private static final String DEPLOYMENT_ID = "com.redhat:antimoneyLaundering:1.0";
	private static final String PROCESS_NAME = "antimoneyLaundering.amlProcess";
	
	public static void main(String[] args) throws MalformedURLException {
		URL baseUrl = new URL("http://" + BPMS_HOST + "/business-central");
		
		RemoteConfiguration config = new RemoteConfiguration(DEPLOYMENT_ID, baseUrl, BPMS_USER, BPMS_PASSWORD);
		config.setServerBaseRestUrl(baseUrl);
		RemoteRestRuntimeEngineFactory factory = new RemoteRestRuntimeEngineFactory(config);
        RemoteRuntimeEngine engine = factory.newRuntimeEngine();
        KieSession ksession = engine.getKieSession();

		// Call process with a name
		Map<String, Object> processVars = new HashMap();
		Account acc= new Account( "1111",  "Sav", "12",
				 "Chicago",  "Anurag",  "Saran",
				 "M",  "SA",  "M",
				 "IL",  "wood",  "60090");
		processVars.put("account", acc);
//		
		Transaction trns = new Transaction( 
				"1111",  20,  2000,
				 2500,  500,
				 50000,  5000,  "USA",
				 "iOS",  "Anurag",  "60090",
				 "1",  "Saran",  "",  "IL",
				 true,  "60090",  "1",
				 0,  "CR");
		processVars.put("transaction", trns);
		ksession.startProcess(PROCESS_NAME, processVars);
	}
	
	

}