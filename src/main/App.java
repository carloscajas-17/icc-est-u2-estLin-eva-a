package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        Stack<String> pila = new Stack<>();
        pila.add("ANA");
        pila.add("Luis");
        pila.add("Pedro");
        pila.add("Juan");
        System.out.println(pila);

        List<String> lista = new ArrayList<>();
        lista.add("r");
        lista.add("a");
        lista.add("d");
        lista.add("r");
       




         




    }
}
