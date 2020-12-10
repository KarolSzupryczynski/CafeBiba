package pl.coderslab.CafeBiba.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Table(name="books")
@Entity
@Getter
@Setter
@Transactional
public class Book implements EntityModel{

    @Column(name="title")

    private String title;

    @ManyToOne (fetch = FetchType.EAGER, optional = true, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(name="isbn")
    private String isbn;

    @Column(name="issue_date")
    private int issueDate;

    @Column(name="publisher")
    private String publisher;

    @ManyToOne (fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

//TODO   private boolean status;
//   private String tempOwner;

}
