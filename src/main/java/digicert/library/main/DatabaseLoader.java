package digicert.library.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import digicert.library.entities.Book;
import digicert.library.repositories.BookRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {
	
	private final BookRepository repository;
	
	@Autowired
	public DatabaseLoader(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		this.repository.save(new Book("Harry Potter and The Prisoner of Askaban", "J.K. Rowling", "9780605953208"));
	}

}
