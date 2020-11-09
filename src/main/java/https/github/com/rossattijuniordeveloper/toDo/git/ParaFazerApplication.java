package https.github.com.rossattijuniordeveloper.toDo.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParaFazerApplication {
	
	@GetMapping("/")	
	public String hello() {
		return "E aê Xômano";
	}
	public static void main(String[] args) {
		SpringApplication.run(ParaFazerApplication.class, args);
	}

}
