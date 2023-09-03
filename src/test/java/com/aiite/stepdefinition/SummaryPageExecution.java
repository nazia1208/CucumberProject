package com.aiite.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.aiite.pagefactory.LoginPage;
import com.aiite.pagefactory.SwagPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class SummaryPageExecution {
	
	@Given("Navigage to Sign up Page")
	public void navigage_to_Sign_up_Page() {
//		LoginPage lp = new LoginPage();
//		lp.createAccBtn.click();
	}

	@When("Provide valid details and create an account")
	public void provide_valid_details_and_create_an_account(DataTable dataTable) {
		//DataTable as List
//		List<String> detail = dataTable.asList();
//		
//		SwagPage lp = new SwagPage();
//		lp.userName.sendKeys(detail.get(0));
//		lp.passWord.sendKeys(detail.get(1));
//		
//		for (String value : detail) {
//			System.out.println(value);
//			
//		}
		
		//DataTable as List of List
//		List<List<String>> employees = dataTable.asLists();
//		
//		for(int i=0; i<employees.size();i++) {
//			List<String> employee = employees.get(i);
////			System.out.println(employee.get(1));
//
//			for (String value : employee) {
//				System.out.println(value);
//			}
//		}
		
		//DataTable as List of Map
//		List<Map<String, String>> employeesMap = dataTable.asMaps();
//		Map<String, String> employeeMap = employeesMap.get(1);
//		
//		Set<Entry<String, String>> entrySet = employeeMap.entrySet();
//		for (Entry<String, String> entry : entrySet) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
	}

}
