package com.example.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.provider.pay.DemoService;

/**
 * 资金流水接口
 * @author peng
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/pay/")
public class PayQryController {
	
	@Autowired
	DemoService demoService;

	   @RequestMapping(value = "/qrybalance/{accountId}")
	    public Long qryBalance(@PathVariable("accountId") Long accountId){
		  demoService.sayHello("tony's  dubbo");
		  return accountId;
	  }
}
