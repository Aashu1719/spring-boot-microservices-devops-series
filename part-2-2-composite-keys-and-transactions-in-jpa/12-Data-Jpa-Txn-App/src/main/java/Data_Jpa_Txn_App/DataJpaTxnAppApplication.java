package Data_Jpa_Txn_App;

import Data_Jpa_Txn_App.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaTxnAppApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaTxnAppApplication.class, args);

		EmployeeService employeeService = context.getBean(EmployeeService.class);

		employeeService.saveData();
	}

}
