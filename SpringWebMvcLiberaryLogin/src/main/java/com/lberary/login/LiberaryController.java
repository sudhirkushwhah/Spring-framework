package com.lberary.login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LiberaryController {

	@RequestMapping("/login")
	public ModelAndView liberary() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("bookstore");
		return mv;
	}
	
	@PostMapping("/LibraryLoginServlet")
	@ResponseBody
	public String logoinprocess(@RequestParam("email") String email, @RequestParam("studentId") String studentId) {
		System.out.println("email :"+email);
		System.out.println("studentId :"+studentId);
		return "successfully login";
	}
}
