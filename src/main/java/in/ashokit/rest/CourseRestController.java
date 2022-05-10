package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/info")
	public ResponseEntity<String> getData(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {

		String responseMsg = "";

		if (cname.equals("SBMS") & tname.equals("Ashok")) {
			responseMsg = "New Batch" + cname + " Will Start By " + tname + " With In a Week..!!";
		} else {
			responseMsg = "Please visit www.ashokitech.com for more details";
		}

		return new ResponseEntity<>(responseMsg, HttpStatus.OK);
	}
}
