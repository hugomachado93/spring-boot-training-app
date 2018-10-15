package com.example.apptrainig.model.Enum;

public enum EstadoPagamento {

    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private int estado;
    private String nome;

    private EstadoPagamento(int estado, String nome){
        this.estado = estado;
        this.nome = nome;
    }

    public int getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    public static EstadoPagamento toEnum(int estado){
        for(EstadoPagamento x : EstadoPagamento.values()){
            if(x.getEstado() == estado){
                return x;
            }
        }
        throw new IllegalArgumentException("Estado invalido: " + estado);
    }

}
