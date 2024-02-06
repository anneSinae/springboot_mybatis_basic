package com.anne.wow.home;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anne.wow.model.Test;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HomeService {

	private final HomeRepository homeRepository;
    
	public List<Test> getTestList() {
		return this.homeRepository.getTestList();
	}
    
	public int insertTest(Test test) {
		return this.homeRepository.insertTest(test);
	}
	
	public int deleteTest(int test_no) {
		return this.homeRepository.deleteTest(test_no);
	}
}
