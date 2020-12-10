package pl.coderslab.CafeBiba.entity;

import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Table(name="authors")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author implements EntityModel  {
    //@OneToMany(mappedBy = "author", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //private List<Book> books;

    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name="author_id")
    private Long id;
}
