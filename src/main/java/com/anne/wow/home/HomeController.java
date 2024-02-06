package com.anne.wow.home;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.anne.wow.model.Test;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HomeController {
	
	private final HomeService homeService;
	
	@RequestMapping("/")
	public ModelAndView Home() {
		ModelAndView view = new ModelAndView("/home/home");
		view.addObject("testList", homeService.getTestList());
		return view;
	}
	
	@PostMapping("/home/new")
	public ResponseEntity<Integer> InsertTest(@RequestBody Test test) {
		return new ResponseEntity<>(homeService.insertTest(test), HttpStatus.OK);
	}
	
	@DeleteMapping("/home/user")
	public ResponseEntity<Integer> DeleteTest(@RequestParam int test_no) {
		return new ResponseEntity<>(homeService.deleteTest(test_no), HttpStatus.OK);
	}
	
	@GetMapping("/home/list")
	public ModelAndView reloadList() {
		ModelAndView view = new ModelAndView("home/home :: testList_wrap");
		view.addObject("testList", homeService.getTestList());
	    return view;
	}
}