package com.batch.demo.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.batch.demo.model.User;

@Component
public class Processor implements ItemProcessor<User,User> {

	private static final Map<String,String> DEPT_NAMES = new HashMap();
	
	public Processor() {
		DEPT_NAMES.put("1", "Math");
		DEPT_NAMES.put("2", "Science");
		DEPT_NAMES.put("3", "telugu");
	}
	@Override
	public User process(User user) throws Exception {
		String deptCode =user.getDept();
		String deptname = DEPT_NAMES.get(deptCode);
		user.setDept(deptname);
		return user;
	}

}
