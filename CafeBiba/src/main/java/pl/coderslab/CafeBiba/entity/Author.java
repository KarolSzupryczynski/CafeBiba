package pl.coderslab.CafeBiba.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Table(name="authors")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author implements EntityModel  {

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private List<Book> books;

    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="author_id")
    private Long id;
}
