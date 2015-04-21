package com.springmvc.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.bean.User;

@Controller
@RequestMapping("/spring")
// requestmapping ����������������struts2�������������ռ�Ĺ���
public class SpringMvcTest {

	@RequestMapping("/hello")
	public String sayHello() {

		System.out.println("testSpring");

		return "succ";
	}

	/**
	 * 
	 * 
	 * ���method����������ʽ �ﵽ����ȷ�Ŀ��� ��
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(value = "/method", method = RequestMethod.GET)
	public String testMethod() {

		System.out.println("testMethod");

		return "succ";
	}

	/**
	 * 
	 * @PathVariable ����ӳ��url�е�ռλ����Ŀ�귽���Ĳ�����
	 * 
	 * 
	 *               spring3.0 ��ӵĹ��� ֧��rest���url��ӵĹ���
	 * @return
	 */
	@RequestMapping("/testPathVariable/{xx}")
	public String testPathVariable(@PathVariable("xx") Integer id) {

		System.out.println("testPathVariable : " + id);

		return "succ";
	}

	/**
	 * 
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(value = "/testRest", method = RequestMethod.POST)
	public String testRest() {

		System.out.println("testPost");

		return "succ";
	}

	@RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
	public String testGet(@PathVariable("id") Integer id) {

		System.out.println("testGet : " + id);
	
		return "succ";
	}

	@RequestMapping(value="/testRest/{id}",method= RequestMethod.DELETE)
	public String testDelete(@PathVariable("id") Integer id) {

		System.out.println("testDelete : "+ id);
		
		return "succ" ;
	}
	
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.PUT)
	public String testUpdate(@PathVariable("id") Integer id){
		
		
		System.out.println("testUpdate : " + id );
		
		return "succ" ;
	}
	
	
	
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam(value="uName") String name,
			@RequestParam(value="age",required=false,defaultValue="")String age){
	
		System.out.println("params :" + name +" , age = "+age);
		
		return "succ";
	}
	
	
	/**
	 * 
	 * 
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/testPojo")
	public String testPojo(User user){
		
		System.out.println("the pojo is  : "+ user.getOther().getOtherName());
		
		return "succ" ;
	}
	
	
	
	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView(){
		
		String viewName = "succ" ;
		
		ModelAndView  modelView = new ModelAndView(viewName) ;
		modelView.addObject("time",new Date()) ;
		
		return modelView;
	}
	
	
	
	
	@RequestMapping("/testMap")
	public String testMap(Map<String,Object> map){
		
		Map<String,Object> aa  = new HashMap<String,Object>() ;
		aa.put("aa", "aaa") ;
		aa.put("bb", "aaab") ;
		aa.put("cc", "aaac") ;
		aa.put("dd", "aaad") ;
		map.put("testMap", aa);
		
		
		return "succ" ;
	}
	
	
	/**
	 * 
	 * 
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(Map<String,Object> map){
		
		
		User user = new User() ;
		user.setId(3);
		user.setName("testName");
		user.setPassword("testPassWord");
		
		map.put("user", user);
		
		
		return "succ" ;
	}
	
	@RequestMapping("/testViewAndViewResolver")
	public String testViewAndViewResolver(){
		
		System.out.println("testViewAndViewResolver");
		
		return "succ" ;
	}
	
	
	
}
