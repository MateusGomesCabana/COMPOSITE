/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author ALUNO
 */
public abstract class Pessoa {

    String tipo;

    public void printPessoa(String tipo) {
        System.out.println(this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void adicionarFilho(Pessoa novaPessoa) throws Exception {
        throw new Exception("Não pode gerar uma nova pessoa: "
                + this.tipo);
    }

    public Pessoa getPessoa(String nomeDapessoa) throws Exception {
        throw new Exception(
                this.tipo + " - Não é uma pasta");
    }
}
