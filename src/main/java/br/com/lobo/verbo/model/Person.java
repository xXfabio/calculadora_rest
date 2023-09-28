package br.com.lobo.verbo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;

}
