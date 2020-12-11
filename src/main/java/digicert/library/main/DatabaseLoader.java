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
		this.repository.save(new Book("Harry Potter and The Socerer's Stone", "J.K. Rowling", "9780590353403"));
		this.repository.save(new Book("Harry Potter and The Chamber of Secrets", "J.K. Rowling", "9780613287142"));
		this.repository.save(new Book("Harry Potter and The Prisoner of Askaban", "J.K. Rowling", "9781484476253"));
		this.repository.save(new Book("Harry Potter and The Goblet of Fire", "J.K. Rowling", "9785353005797"));
		this.repository.save(new Book("Harry Potter and The Order of the Phoenix", "J.K. Rowling", "9780439567626"));
		this.repository.save(new Book("Harry Potter and The Half Blood Prince", "J.K. Rowling", "9780439791328"));
		this.repository.save(new Book("Harry Potter and The Deathly Hallows", "J.K. Rowling", "9780545029377"));
	}

}
