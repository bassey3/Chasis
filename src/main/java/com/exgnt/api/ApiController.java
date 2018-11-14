package com.exgnt.api;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

@RestController
public class ApiController {

	@ApiOperation(value = "Get Application Details", notes = "The Application details", response =About.class )
	@GetMapping("/about")
	public ResponseEntity<About> profile( @RequestHeader HttpHeaders header) {
		About about = new About();
		return new ResponseEntity<About>(about, HttpStatus.OK);	
	}
	
}
