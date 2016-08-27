package com.arpit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arpit.model.Note;

@Controller
@RequestMapping("/notes")
public class NotesController {

	@RequestMapping(value = "/{username}/add", method = RequestMethod.POST)
	public String add(@RequestBody Note note,
			@PathVariable("username") String username) {
		System.out.println("username is: " + username + " and note is: " + note);
		return "AddNote";
	}
}
