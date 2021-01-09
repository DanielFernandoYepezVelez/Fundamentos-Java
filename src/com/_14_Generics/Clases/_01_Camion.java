package com._14_Generics.Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01_Camion<T> implements Iterable<T> {

    private List<T> objetos;
    private int max;

    public _01_Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(T objeto) {
        if(this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("No Hay Màs Espacio");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
