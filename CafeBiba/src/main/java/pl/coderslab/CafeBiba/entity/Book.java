package pl.coderslab.CafeBiba.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Table(name="books")
@Entity
@Data
@Transactional
public class Book implements EntityModel{

    @Column(name="title")

    private String title;

    @ToString.Exclude
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", unique=true)
    private Author author;

    @Column(name="isbn")
    private String isbn;

    @Column(name="issue_date")
    private int issueDate;

    @Column(name="publisher")
    private String publisher;

    @ToString.Exclude
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", unique=true)
    private Category category;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


//TODO   private boolean status;
//   private String tempOwner;

}
