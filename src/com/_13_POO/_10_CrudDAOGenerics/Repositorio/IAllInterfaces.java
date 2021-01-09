package com._13_POO._10_CrudDAOGenerics.Repositorio;

public interface IAllInterfaces<T> extends ICrud<T>, IOrdenable<T>, IPaginable<T>, IContable {
}
