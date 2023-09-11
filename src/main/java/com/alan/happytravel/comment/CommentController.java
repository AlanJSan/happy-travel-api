package com.alan.happytravel.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CommentController {
	
	@Autowired
	private CommentDao commentDao;
	
	@GetMapping("/comments")
	public List<Comment> getComments() {
		return commentDao.getComments();
	}

}