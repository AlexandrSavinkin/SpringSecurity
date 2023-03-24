package ru.kata.spring.boot_security.demo.models;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

public Role(){

}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return getName();
    }


//    @ManyToMany //(cascade = Cascade.Type.ALL)
//    @JoinTable(name="users_roles", joinColumns = @JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name = "user_id"))
//    private Collection<User> users;
//    // у Трегулова private List<Role>roles;
}
