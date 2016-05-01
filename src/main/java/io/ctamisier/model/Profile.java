package io.ctamisier.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Profile {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
