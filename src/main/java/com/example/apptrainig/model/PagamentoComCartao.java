package com.example.apptrainig.model;

import com.example.apptrainig.model.Enum.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento {

    private static final long serialVersionUID = 1L;

    private int numeroDeParcelas;

    public PagamentoComCartao(int id, EstadoPagamento estado, Pedido pedido, int numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
