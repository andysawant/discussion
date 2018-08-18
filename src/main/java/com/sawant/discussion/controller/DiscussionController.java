package com.sawant.discussion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscussionController {

		/*@Autowired
		private DiscussionDAO dao;*/
		
		@GetMapping(path="/hello")
		public String Greeting() {
			
			return "aaaaaaaaaaaaaaaaaa";
		}
		
		@RequestMapping(value = "/discussion/add", 
			    method = RequestMethod.POST,
			    consumes = "text/plain")
			public String addDiscussion(@RequestBody String payload) throws Exception {

			return payload;

			}
}