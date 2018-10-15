package com.example.apptrainig.model.Enum;

public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Fisica"),
    PESSOAJURIDICA(2, "Pessoa Fisica");

    private int cod;
    private String descricao;

    TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(int cod){
        for(TipoCliente x : TipoCliente.values()){
            if(cod == x.cod){
                return x;
            }
        }

        throw new IllegalArgumentException("Id invalid " + cod);
    }

}
