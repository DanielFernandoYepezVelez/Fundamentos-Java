package com._12_POO._11_CrudDAOExceptions.Repositorio;

import com._12_POO._11_CrudDAOExceptions.Repositorio.Exceptions.LecturaAccesoDato;

import java.util.List;

public interface ICrud<T> {
    List<T> listar();
    T porIdCliente(Integer id) throws LecturaAccesoDato;
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);
}
