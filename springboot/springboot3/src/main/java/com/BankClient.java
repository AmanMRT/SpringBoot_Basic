package com;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankClient {
	@RequestMapping("/bankbranch")
	public String getBankBranch() {
		return "branch";
	}
	@RequestMapping("/bankservice")
	public String getBankService() {
		return "bankservice";
	}

}
