package pl.coderslab.CafeBiba.entity;

import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Table(name="categories")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Category implements EntityModel{
   // @OneToMany(mappedBy = "category", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   // private List<Book> books;

    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private Long id;
}