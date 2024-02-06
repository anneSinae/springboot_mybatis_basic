package com.anne.wow.home;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.anne.wow.model.Test;

@Repository
@Mapper
public interface HomeRepository {
	
	List<Test> getTestList();
	int insertTest(Test test);
	int deleteTest(int test_no);
	
}
