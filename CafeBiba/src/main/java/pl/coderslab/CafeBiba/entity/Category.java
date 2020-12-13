package pl.coderslab.CafeBiba.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Table(name="categories")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Category implements EntityModel{

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<Book> books;

    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private Long id;
}