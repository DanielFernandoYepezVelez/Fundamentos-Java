package com._02_Variables._05_TiposReferenciaObjeto;

import java.lang.reflect.Method;

public class _09_WrapperGetClass {
    public static void MethodGetClass() {
        String text = "Hello!!!, How Are You?";
        Integer number = 23;

        Class strClass = text.getClass();
        Class numberClass = number.getClass();

        System.out.println("\n========== WRAPPERS METHOD GETCLASS ==========");
        System.out.println("WRAPPER STRING");
        System.out.println("strClass = " + strClass);
        System.out.println("strClass.getSuperclass() = " + strClass.getSuperclass());
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());

        System.out.println("\nWRAPPER INTEGER");
        System.out.println("numberClass = " + numberClass);
        System.out.println("numberClass.getSuperclass() = " + numberClass.getSuperclass());
        System.out.println("numberClass.getSuperclass().getSuperclass() = " + numberClass.getSuperclass().getSuperclass());
        System.out.println("numberClass.getName() = " + numberClass.getName());
        System.out.println("numberClass.getSimpleName() = " + numberClass.getSimpleName());
        System.out.println("numberClass.getPackageName() = " + numberClass.getPackageName());

        System.out.println("\nCICLO WRAPPER STRING");
        for (Method method: strClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }

        System.out.println("\nCICLO WRAPPER INTEGER");
        for (Method method: numberClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }
    }
}
