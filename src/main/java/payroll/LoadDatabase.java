package payroll;

import lombok.NonNull;

import payroll.entity.Employee;
import payroll.repository.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  // @NonNull
  // private final Employee Bilbo = new Employee("Bilbo Baggins", "burglar");

  // @NonNull
  // private final Employee Frodo = new Employee("Frodo Baggins", "thief");

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {
    return args -> {
      log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
      log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));

      // Using Lombok's @NonNull for Anonym
      @NonNull
      Employee Anonym = new Employee("hidden", "guy", "expat");
      repository.save(Objects.requireNonNull(Anonym, "Anonym must not be null"));
    };
  }
}
