package pl.coderslab.CafeBiba.entity;

import lombok.Data;

@Data
public class User implements EntityModel{

    private String email;
    private String password;

    @Override
    public void setId(Long id) {

    }

    @Override
    public Long getId() {
        return null;
    }
}
