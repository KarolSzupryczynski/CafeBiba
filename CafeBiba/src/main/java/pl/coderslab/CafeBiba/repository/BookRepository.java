package pl.coderslab.CafeBiba.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.CafeBiba.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
}