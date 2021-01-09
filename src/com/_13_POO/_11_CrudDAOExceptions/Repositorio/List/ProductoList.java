package com._13_POO._11_CrudDAOExceptions.Repositorio.List;

import com._13_POO._11_CrudDAOExceptions.Repositorio.AbtractaList;
import com._13_POO._11_CrudDAOExceptions.Repositorio.Direccion;
import com._13_POO._11_CrudDAOExceptions.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoList extends AbtractaList<Producto> {
    @Override
    public void editar(Producto producto) {
        Producto product = porIdCliente(producto.getId());
        product.setDescripcion(product.getDescripcion());
        product.setPrecio(product.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);

        /** Ordenar Y/O Comparar Objetos<Genericos O Generales> */
/*        this.dataSource.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto a, Producto b) {
                int resultado = 0;

                if(dir == Direccion.ASC) {

                    switch (campo) {
                        case "id":
                                resultado = a.getId().compareTo(b.getId());
                        case "nombre":
                                resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido":
                            resultado = a.getApellido().compareTo(b.getApellido());
                    }

                } else if (dir == Direccion.DESC) {

                    switch (campo) {
                        case "id":
                            resultado = b.getId().compareTo(a.getId());
                        case "nombre":
                            resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido":
                            resultado = b.getApellido().compareTo(a.getApellido());
                    }
                }

                return resultado;
            }
        });*/

        /** Queda Màs Simple Con Expresiones Lamda */
        /* listaOrdenada.sort((a, b) -> {
                int resultado = 0;

                if(dir == Direccion.ASC) {

                    switch (campo) {
                        case "id":
                                resultado = a.getId().compareTo(b.getId());
                        case "nombre":
                                resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido":
                            resultado = a.getApellido().compareTo(b.getApellido());
                    }

                } else if (dir == Direccion.DESC) {

                    switch (campo) {
                        case "id":
                            resultado = b.getId().compareTo(a.getId());
                        case "nombre":
                            resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido":
                            resultado = b.getApellido().compareTo(a.getApellido());
                    }
                }

                return resultado;
            }
        );

        return this.dataSource; */

        /** Aplico Esta Clase Anonima Para Poder Realizar Varios Métodos
         * Lo Que No Es Posible Con Las Expresiones Lamda (OPTIMIZACIÒN DE CÒDIGO) */
        /* listaOrdenada.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto a, Producto b) {
                int resultado = 0;

                if(dir == Direccion.ASC) {
                    resultado = this.ordenar(a, b);
                } else if (dir == Direccion.DESC) {
                    resultado = this.ordenar(b, a);
                }

                return resultado;
            }

            // Aquí Tenemos El Segundo Método De La Clase Anónima
            private int ordenar(Producto a, Producto b) {
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
            }
        });

        return listaOrdenada; */

        /* Expesiòn Lambda Y El Mètodo Estàtico Ordenar */
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;

            if(dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }

            return resultado;
        });

        return listaOrdenada;
    }

    public static int ordenar(String campo, Producto a, Producto b) {
        int resultado = 0;

        switch (campo) {
            case "id":
                resultado = a.getId().compareTo(b.getId());
            case "descripcion":
                resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio":
                resultado = a.getPrecio().compareTo(b.getPrecio());
        }

        return resultado;
    }
}
