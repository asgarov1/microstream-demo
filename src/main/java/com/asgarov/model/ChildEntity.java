package com.asgarov.model;

import com.asgarov.util.IdGenerator;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class ChildEntity {

    @Id
    private Long id = IdGenerator.next();
    private String a = UUID.randomUUID().toString();
    private String b = UUID.randomUUID().toString();
    private String c = UUID.randomUUID().toString();
    private String d = UUID.randomUUID().toString();
    private String e = UUID.randomUUID().toString();

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "child_entity_id")
    private ParentEntity parentEntity;

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

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public ParentEntity getParentEntity() {
        return parentEntity;
    }

    public void setParentEntity(ParentEntity parentEntity) {
        this.parentEntity = parentEntity;
    }
}
