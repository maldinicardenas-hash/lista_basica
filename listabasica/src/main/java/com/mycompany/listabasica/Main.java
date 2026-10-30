package com.mycompany.listabasica;

/**
 * EJERCICIO 1 — Lista Enlazada Básica (enteros)
 *
 * Conceptos ilustrados:
 *   - Clase auto-referenciada : Nodo (contiene una referencia a otro Nodo)
 *   - Nodo                    : unidad básica con dato + enlace
 *   - Campo de enlace         : campo "enlace" dentro de cada Nodo
 *   - Enlace                  : la conexión entre nodos consecutivos
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // ── 1. Crear la lista enlazada ─────────────────────────────────────
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("=== EJERCICIO 1 — LISTA ENLAZADA BÁSICA ===\n");

        // ── 2. Insertar nodos ──────────────────────────────────────────────
     System.out.println("Ingrese 5 números:");

    for (int i = 1; i <= 5; i++) {
    System.out.print("Ingrese el número " + i + ": ");
    int numero = teclado.nextInt();

    lista.insertar(numero);
    }

    System.out.println("Lista ingresada:");
    lista.mostrar();

        /*
         * Internamente los nodos se ven así:
         *
         *   ┌───────────┐    ┌───────────┐    ┌───────────┐
         *   │ dato: 10  │    │ dato: 20  │    │ dato: 30  │  ...
         *   │ enlace: ──┼───▶│ enlace: ──┼───▶│ enlace: ──┼───▶ null
         *   └───────────┘    └───────────┘    └───────────┘
         *      Nodo 1            Nodo 2            Nodo 3
         *
         *  "enlace" es el CAMPO DE ENLACE → hace que Nodo sea AUTO-REFERENCIADA
         */

        // ── 3. Tamaño ──────────────────────────────────────────────────────
        System.out.println("\n▶ Tamaño de la lista: " + lista.tamanio());

        // ── 4. Buscar ──────────────────────────────────────────────────────
        System.out.println("\n▶ Buscar 30: " + lista.buscar(30));  // true
        System.out.println("▶ Buscar 99: " + lista.buscar(99));  // false

        // ── 5. Eliminar ────────────────────────────────────────────────────
       
        System.out.print("\nIngrese el número que desea eliminar: ");
      int numeroEliminar = teclado.nextInt();

       lista.eliminar(numeroEliminar);

System.out.println("Lista después de eliminar:");
lista.mostrar();

        System.out.println("\n▶ Eliminando cabeza ...");
        lista.eliminar(numeroEliminar);
        lista.mostrar();

        // ── 6. Ver estructura de un Nodo manualmente ───────────────────────
        System.out.println("\n=== ANATOMÍA DE UN NODO ===");
        Nodo n1 = new Nodo(100);
        Nodo n2 = new Nodo(200);
        Nodo n3 = new Nodo(300);

        n1.enlace = n2;   // n1 → n2
        n2.enlace = n3;   // n2 → n3

        System.out.println("n1.dato              = " + n1.dato);
        System.out.println("n1.enlace            = " + n1.enlace);
        System.out.println("n1.enlace.enlace     = " + n1.enlace.enlace);
        System.out.println("cadena: " + n1 + " → " + n2 + " → " + n3 + " → null");
    }
}
