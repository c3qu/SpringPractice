package top.tantalum.sp1_3_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Show {
	@GetMapping("/")
	public String home(){
		return "11";
	}
}
