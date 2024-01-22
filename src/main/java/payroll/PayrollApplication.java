package payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import payroll.entity.Employee;

@SpringBootApplication
public class PayrollApplication {

	public static void testing() {
		// Employee Bilbo = new Employee("Baggins", "burglar");
		// Employee Frodo = new Employee("Baggins", "burglar");

		// Bilbo.setId(1L);
		// Frodo.setId(1L);
		// System.out.println(Bilbo.equals(Frodo) + " 55555555555555");
		// System.out.println(Bilbo.hashCode());
		// System.out.println(Bilbo.hashCode());
	}

	public static void main(String... args) {
		SpringApplication.run(PayrollApplication.class, args);

		testing();
	}

}
