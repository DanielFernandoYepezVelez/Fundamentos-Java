package com._12_POO._11_CrudDAOExceptions.modelo;

public class ClientePremium extends Cliente implements Comparable<ClientePremium>{

    public ClientePremium(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(ClientePremium o) {
        return 0;
    }
}
