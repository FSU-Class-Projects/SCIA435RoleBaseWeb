package edu.fsu.scia435.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(length = 100)
    private String name;
    private String description;

    private Date createdAt;
    private Date updatedAt;

    @OneToMany(mappedBy = "role")
    private List<User> users;
}
