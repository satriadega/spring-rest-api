package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import payroll.entity.Employee;
import payroll.repository.EmployeeRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  Employee Bilbo = new Employee("Bilbo Baggins", "burglar");
  Employee Frodo = new Employee("Frodo Baggins", "thief");

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(Bilbo));
      log.info("Preloading " + repository.save(Frodo));
      Employee Anonym = new Employee("hidden guy", "expat");
      repository.save(Anonym);
    };
  }
}