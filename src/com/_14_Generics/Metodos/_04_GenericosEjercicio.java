package com._14_Generics.Metodos;

public class _04_GenericosEjercicio {
    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;

        if(b.compareTo(max) > 0) {
            max = b;
        }

        if(c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
}
