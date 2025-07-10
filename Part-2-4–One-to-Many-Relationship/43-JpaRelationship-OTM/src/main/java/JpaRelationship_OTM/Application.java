package JpaRelationship_OTM;

import JpaRelationship_OTM.service.EmpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpService empService = context.getBean(EmpService.class);

//		empService.saveEmp();

		empService.saveAdd();

//		empService.getEmployee();

//		empService.getAddress();

//		empService.deleteEmp();
	}

}
