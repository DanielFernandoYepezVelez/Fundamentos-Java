package com._12_POO._11_CrudDAOExceptions.Repositorio;

import java.util.List;

public interface IPaginable<T> {
    List<T> listar(int desde, int hasta);
}
