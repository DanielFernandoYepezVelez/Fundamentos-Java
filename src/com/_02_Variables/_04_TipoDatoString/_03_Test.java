package com._02_Variables._04_TipoDatoString;

public class _03_Test {
    public static void Rendimiento() {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        System.out.println("\n========== TEST RENDIMIENTO STRING ==========");
        System.out.println("========== DEPENDE MUCHO DEL NÙMERO DE CONCATENACIONES ==========");

        long inicio = System.currentTimeMillis();
        System.out.println(inicio);

        for(int i = 0; i < 100000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 156ms, 100000 => 9405ms
            //c += a + b + "\n";                      // 500 => 47ms, 1000 => 63ms, 10000 => 140ms, 100000 => 4090ms
            //sb.append(a).append(b).append("\n");      // 500 => 0ms, 1000 => 0ms, 10000 => 0ms, 100000 => 31ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin);

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
