/**
 * 
 */
package com.nextsteps.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextsteps.bean.LoginBean;
import com.nextsteps.response.NextStepsResponse;
import com.nextsteps.response.NextStepsSuccessResponse;

/**
 * @author sunil
 *
 */
@RestController
public class Login {

	
	 
		@RequestMapping(value = "/countries", method = RequestMethod.GET,headers="Accept=application/json")
		public NextStepsResponse getCountries()
		{
			List<LoginBean> listOfCountries = new ArrayList<LoginBean>();
			listOfCountries=createLoginBeanList();
			return new NextStepsSuccessResponse(listOfCountries);
		}
	 
		@RequestMapping(value = "/LoginBean/{id}", method = RequestMethod.GET,headers="Accept=application/json")
		public LoginBean getLoginBeanById(@PathVariable int id)
		{
			List<LoginBean> listOfCountries = new ArrayList<LoginBean>();
			listOfCountries=createLoginBeanList();
	 
			for (LoginBean LoginBean: listOfCountries) {
				if(LoginBean.getId()==id)
					return LoginBean;
			}
	 
			return null;
		}
	 
		// Utiliy method to create LoginBean list.
		public List<LoginBean> createLoginBeanList()
		{
			LoginBean indiaLoginBean=new LoginBean(1l, "India");
			LoginBean chinaLoginBean=new LoginBean(4l, "China");
			LoginBean nepalLoginBean=new LoginBean(3l, "Nepal");
			LoginBean bhutanLoginBean=new LoginBean(2l, "Bhutan");
	 
			List<LoginBean> listOfCountries = new ArrayList<LoginBean>();
			listOfCountries.add(indiaLoginBean);
			listOfCountries.add(chinaLoginBean);
			listOfCountries.add(nepalLoginBean);
			listOfCountries.add(bhutanLoginBean);
			return listOfCountries;
		}
}
