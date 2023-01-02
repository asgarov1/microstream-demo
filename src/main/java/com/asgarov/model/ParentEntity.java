package com.asgarov.model;

import com.asgarov.util.IdGenerator;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
public class ParentEntity {

    @Id
    private Long id = IdGenerator.next();
    private String a = UUID.randomUUID().toString();
    private String b = UUID.randomUUID().toString();
    private String c = UUID.randomUUID().toString();
    private String d = UUID.randomUUID().toString();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parentEntity")
    private List<ChildEntity> children;

    public ParentEntity() {
    }

    public ParentEntity(List<ChildEntity> children) {
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public List<ChildEntity> getChildren() {
        return children;
    }

    public void setChildren(List<ChildEntity> children) {
        this.children = children;
    }
}
