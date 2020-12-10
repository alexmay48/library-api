package digicert.library.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("digicert.library.repositories")
@EntityScan("digicert.library.entities")
public class DigicertLibraryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigicertLibraryApiApplication.class, args);
	}

}
