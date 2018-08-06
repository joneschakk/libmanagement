package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;;

@Controller
public class libcontroller {
	@Autowired
	Bookrepo bkrepo;
	@Autowired
	Userrepo usrrepo;
	
    @RequestMapping("/home")
	public String home()
	{
		return "home";
	}
    @RequestMapping("/addBook")
    public String addBook(Book book)
    {
    	 bkrepo.save(book);
    	 return "home";
    }
    @RequestMapping("/removeBook")
    public String removeBook(Book book)
    {
    	bkrepo.deleteById(book.getId());
    	return "home";
    }
    @RequestMapping("/addUser")
    public String addUser(User user)
    {
    	usrrepo.save(user);
    	return "home";
    }
    @RequestMapping("/removeUser")
    public String removeUser(User user)
    {
    	usrrepo.deleteById(user.getId());
    	return "home";
    }
    
    @RequestMapping("/Search")
    public ModelAndView search(Book book)
    {
    	
    	
    	List<Book> allBooks = bkrepo.findBytitle(book.getTitle());
    	return new ModelAndView("listofbooks", "book", allBooks);
    }
    
}