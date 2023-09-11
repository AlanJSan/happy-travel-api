package com.alan.happytravel.state;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {
	
	@Autowired
	private StateDao stateDao;
	
	@GetMapping("/states")
	public List<State> getStates() {
		return stateDao.getStates();
	}

}
