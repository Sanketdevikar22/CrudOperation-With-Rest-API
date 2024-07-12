package com.transport.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.transport.common.beans.User;
import com.transport.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Override
	public int saveUser(User user) {
		ArrayList<User> arrayList = new ArrayList<User>();
		arrayList.add(user);
		return arrayList.size() > 0 ? 1 : 0;
	}

}
