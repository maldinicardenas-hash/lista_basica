package com.mycompany.listabasica;

/**
 * CLASE AUTO-REFERENCIADA Creado por Ing Jaider Reyes Herazo
 *
 * Un Nodo contiene:
 *   1) dato   → el valor almacenado (campo de datos)
 *   2) enlace → referencia al SIGUIENTE Nodo del mismo tipo
 *               (campo de enlace — hace que la clase sea auto-referenciada)
 */
public class Nodo {

    // ── Campo de datos ────────────────────────────────────────────────────
    int dato;

    // ── Campo de enlace ───────────────────────────────────────────────────
    // "enlace" apunta a otro objeto Nodo (o null si es el último nodo).
    // Esto convierte a Nodo en una CLASE AUTO-REFERENCIADA.
    Nodo enlace;   // <── ENLACE: referencia al siguiente Nodo

    // ── Constructor ───────────────────────────────────────────────────────
    public Nodo(int dato) {
        this.dato   = dato;
        this.enlace = null;   // por defecto no apunta a nadie
    }

    // ── Representación textual ────────────────────────────────────────────
    @Override
    public String toString() {
        return "[" + dato + "]";
    }
}
