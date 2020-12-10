package pl.coderslab.CafeBiba.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.CafeBiba.entity.Author;


public interface AuthorRepository extends JpaRepository<Author, Long> {
}