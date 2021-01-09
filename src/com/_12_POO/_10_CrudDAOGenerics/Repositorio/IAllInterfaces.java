package com._12_POO._10_CrudDAOGenerics.Repositorio;

public interface IAllInterfaces<T> extends ICrud<T>, IOrdenable<T>, IPaginable<T>, IContable {
}
