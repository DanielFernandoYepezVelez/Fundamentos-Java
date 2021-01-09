package com._13_POO._09_CrudDAO.Repositorio;

import com._13_POO._09_CrudDAO.modelo.Cliente;

import java.util.List;

public interface IOrdenable {
    List<Cliente> listar(String campo, Direccion dir);

    /* OTRA FORMA DE IMPLEMENTAR EL MÈTODO ordenar
    default int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;

        switch (campo) {
            case "id":
                resultado = a.getId().compareTo(b.getId());
            case "nombre":
                resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido":
                resultado = a.getApellido().compareTo(b.getApellido());
        }

        return resultado;
    } */
}
