package com._13_POO._10_CrudDAOGenerics.Repositorio;

import java.util.List;

public interface ICrud<T> {
    List<T> listar();
    T porIdCliente(Integer id);
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);
}
