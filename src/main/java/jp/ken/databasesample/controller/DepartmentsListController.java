package jp.ken.databasesample.controller;

import java.util.List;

import jp.ken.databasesample.dao.DepartmentsDAO;
import jp.ken.databasesample.entity.Departments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DepartmentsListController {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	@SuppressWarnings("unchecked")
	private static DepartmentsDAO<Departments> deptDAO = (DepartmentsDAO<Departments>)context.getBean("departmentsDAO");
	
	@RequestMapping(value="/deptList", method=RequestMethod.GET)
	public String empList(Model model){
		List<Departments> list = deptDAO.allList();
		model.addAttribute("message", "ïîèêÉäÉXÉg");
		model.addAttribute("departmentsList", list);
		return "listDepartmentsData";
	}
}
