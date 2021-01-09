package com._12_POO._09_CrudDAO.Repositorio;

import com._12_POO._09_CrudDAO.modelo.Cliente;

import java.util.List;

public interface IPaginable {
    List<Cliente> listar(int desde, int hasta);
}
