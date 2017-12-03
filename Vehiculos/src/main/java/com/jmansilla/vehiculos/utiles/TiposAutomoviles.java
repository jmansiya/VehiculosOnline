package com.jmansilla.vehiculos.utiles;

public enum TiposAutomoviles {
    ELECTRICO("ELECTRICO"),
    DIESEL("DIESEL"),
    GASOLINA("GASOLINA");

    private String tipo;

    private TiposAutomoviles(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
