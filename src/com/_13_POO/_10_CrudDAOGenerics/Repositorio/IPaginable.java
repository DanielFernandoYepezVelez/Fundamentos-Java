package com._13_POO._10_CrudDAOGenerics.Repositorio;

import java.util.List;

public interface IPaginable<T> {
    List<T> listar(int desde, int hasta);
}
