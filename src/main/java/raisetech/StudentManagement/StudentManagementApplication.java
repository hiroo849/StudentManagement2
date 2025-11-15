package raisetech.StudentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

  public  String  name  = "Enami kouji";

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

 @GetMapping("/name")
  public String getName() {
    return name;
  }

  @PostMapping("/name")
  public void  setName(String name){
    this.name = name;
  }
}
