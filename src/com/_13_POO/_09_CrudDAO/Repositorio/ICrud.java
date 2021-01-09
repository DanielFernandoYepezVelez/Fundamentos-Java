package com._13_POO._09_CrudDAO.Repositorio;

import com._13_POO._09_CrudDAO.modelo.Cliente;

import java.util.List;

public interface ICrud {
    List<Cliente> listar();
    Cliente porIdCliente(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
