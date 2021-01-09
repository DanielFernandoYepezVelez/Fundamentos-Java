package com._12_POO._10_CrudDAOGenerics.Repositorio;

import com._12_POO._10_CrudDAOGenerics.modelo.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbtractaList<T extends BaseEntity> implements IAllInterfaces<T> {

    protected List<T> dataSource;

    public AbtractaList() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return this.dataSource;
    }

    @Override
    public T porIdCliente(Integer id) {
        T resultadoDB = null;

        for (T cli: this.dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)) {
                resultadoDB = cli;
                break;
            }
        }

        return resultadoDB;
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porIdCliente(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
