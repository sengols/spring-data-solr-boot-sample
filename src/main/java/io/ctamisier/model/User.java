package io.ctamisier.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "user_")
@ToString
public class User {

    @Id
    @javax.persistence.Id
    private Long id;

    @Field
    private String login;

    private String lastName;

    private String firstName;

    @ManyToOne
    private Profile profile;
}
