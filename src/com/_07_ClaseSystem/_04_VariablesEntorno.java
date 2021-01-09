package com._07_ClaseSystem;

import java.util.Map;

public class _04_VariablesEntorno {
    public static void variablesDeEntorno() {

        Map<String, String> varEnv = System.getenv();

        System.out.println("\n========== VARIABLES DE ENTORNO O AMBIENTE DEL SISTEMA ==========");
        System.out.println("varEnv = " + varEnv);

        String username = System.getenv("username");
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("Path2 Map(Key, Value)= " + path2);

        System.out.println("\n---------- Listando Variables De Entorno ----------");
        for (String key: varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }
    }
}
