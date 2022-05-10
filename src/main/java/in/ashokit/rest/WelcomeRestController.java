package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg(@RequestParam("name") String str){
		String msg = str+ ", Welcome to Ashok IT..!!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
