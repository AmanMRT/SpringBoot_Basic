package com.wipro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@RequestMapping("bankname")
	public String bankName()
	{
		return "ABC Bank";
	}
	
	@RequestMapping("bankaddress")
	public String bankAddress()
	{
		return "Bangalore";
	}
}
