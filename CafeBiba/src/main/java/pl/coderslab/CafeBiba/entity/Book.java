package pl.coderslab.CafeBiba.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Book implements EntityModel{

    private String title;
    private Author author;
    private String isbn;
    private int issueDate;
    private String publisher;
    private String category;
    private boolean status;
    private String tempOwner;



    @Override
    public void setId(Long id) {

    }
    @Id
    @Override
    public Long getId() {
        return null;
    }
}
