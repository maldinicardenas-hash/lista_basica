package com.mycompany.listabasica;

/**
 * LISTA ENLAZADA SIMPLE por  Jaider Enrique Reyes Herazo
 *
 * Mantiene una referencia al primer Nodo (cabeza).
 * Cada Nodo apunta al siguiente a través de su campo "enlace".
 *
 *   cabeza → [10] → [20] → [30] → null
 */
public class ListaEnlazada {

    // Referencia al primer nodo de la lista (ENLACE inicial)
    private Nodo cabeza;

    // ── Constructor ───────────────────────────────────────────────────────
    public ListaEnlazada() {
        cabeza = null;  // lista vacía al inicio
    }

    // ── Insertar al final ─────────────────────────────────────────────────
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.enlace != null) {     // mientras haya ENLACE
                actual = actual.enlace;          // avanzar por el ENLACE
            }
            actual.enlace = nuevo;              // conectar ENLACE al nuevo nodo
        }
    }

    // ── Eliminar por valor ────────────────────────────────────────────────
    public void eliminar(int dato) {
        if (cabeza == null) return;

        if (cabeza.dato == dato) {
            cabeza = cabeza.enlace;
            return;
        }

        Nodo anterior = cabeza;
        while (anterior.enlace != null && anterior.enlace.dato != dato) {
            anterior = anterior.enlace;
        }

        if (anterior.enlace != null) {
            anterior.enlace = anterior.enlace.enlace;
        }
    }
    // ── Buscar ────────────────────────────────────────────────────────────
    public boolean buscar(int dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) return true;
            actual = actual.enlace;
        }
        return false;
    }
    // ── Mostrar la lista ──────────────────────────────────────────────────
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo actual = cabeza;
        System.out.print("cabeza → ");
        while (actual != null) {
            System.out.print(actual + " → ");
            actual = actual.enlace;
        }
        System.out.println("null");
    }

    // ── Tamaño ────────────────────────────────────────────────────────────
    public int tamanio() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.enlace;
        }
        return contador;
    }
}
