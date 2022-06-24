package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Home");
		return mv;
	}
//	//For Browser Insertion
//	@RequestMapping("/add")
//	public ModelAndView add(Student student)
//	{
//		ModelAndView mv = new ModelAndView("Home");
//		repo.save(student);
//		
//		return mv;
//	}
//	
	@PostMapping("/add")
	public ModelAndView add(@RequestBody Student student)
	{
		ModelAndView mv = new ModelAndView("Home");
		repo.save(student);
		
		return mv;
	}
	
	@DeleteMapping("/student/{rollno}")
	public String delete(@PathVariable int rollno)
	{
		ModelAndView mv = new ModelAndView("Home");
		repo.deleteById(rollno);
		
		return "deleted";
	}
	@RequestMapping("/get")
	public ModelAndView find(@RequestParam int rollno)
	{
		ModelAndView mv = new ModelAndView("showStudent");
		Student std = repo.findById(rollno).orElse(new Student());
		
		System.out.println(repo.findAllByAddress("Meerut"));
		
		mv.addObject(std);
		return mv;
	}
	
	@RequestMapping("/students")
	public List<Student> findStudents()
	{
		return (List<Student>) repo.findAll();
	}
	
	@RequestMapping("/student/{rollno}")
	public Optional<Student> findStudent(@PathVariable("rollno")int rollno)
	{
		return repo.findById(rollno);
	}
}
