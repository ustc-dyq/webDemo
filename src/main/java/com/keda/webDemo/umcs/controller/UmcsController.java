/**
 * @Title：UserDaoImpl.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description:
**/
package com.keda.webDemo.umcs.controller;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keda.webDemo.umcs.dao.dto.User;
import com.keda.webDemo.umcs.service.UserService;

@Controller
@RequestMapping("/demo")
public class UmcsController {
	
	private final static Logger log = LoggerFactory.getLogger(UmcsController.class);
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)  
	public void test(HttpServletRequest request,HttpServletResponse response){  
		log.info("登陆成功");

		List<User> users = userService.getAllUser();
		
		
		try {
			response.getWriter().println(users.get(0).getId() + "\n"+users.get(0).getUserName() +
					"\n" + users.get(0).getUserPasswd() + "\n" + users.get(0).getUserPriv());
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
