package com.batch.demo.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.batch.demo.model.User;
import com.batch.demo.repo.UserRepository;

@Component
public class DbWriter implements ItemWriter<User> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void write(List<? extends User> users) throws Exception {
		System.out.println("data saved for users" + users);
		userRepository.saveAll(users);
	}

}
