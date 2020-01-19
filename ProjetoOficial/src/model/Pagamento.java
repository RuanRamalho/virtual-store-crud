/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dário Felipe
 */

public class Pagamento {
    
    private int codigo_pagamento;
    private String nome_titular;
    private String numero_cartao;
    private int codigo_pessoa;

    public int getCodigo_pessoa() {
        return codigo_pessoa;
    }

    public void setCodigo_pessoa(int codigo_pessoa) {
        this.codigo_pessoa = codigo_pessoa;
    }
    
    public int getCodigo_pagamento() {
        return codigo_pagamento;
    }

    public void setCodigo_pagamento(int codigo_pagamento) {
        this.codigo_pagamento = codigo_pagamento;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public String getNumero_cartao() {
        return numero_cartao;
    }

    public void setNumero_cartao(String numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    

}