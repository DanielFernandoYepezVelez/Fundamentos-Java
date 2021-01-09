package com._13_POO._10_CrudDAOGenerics.modelo;

import java.util.Objects;

public class BaseEntity {

    protected Integer id;
    public static int ultimoId;

    public BaseEntity() {
        this.id = ++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity base = (BaseEntity) o;
        return Objects.equals(id, base.id);
    }

}
