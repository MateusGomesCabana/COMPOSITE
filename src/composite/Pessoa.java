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

    String nome;

    public void printPessoa(String nome) {
        System.out.println(this.nome);
    }

    public String getName() {
        return nome;
    }
    
    public void printNomeDaPessoa() {
        System.out.println(this.nome);
    }
 
    
    public void adicionarFilho(Pessoa novaPessoa) throws Exception {
        throw new Exception( this.nome +" Não pode gerar uma nova pessoa ");
    }

    public Pessoa getPessoa(String nomeDapessoa) throws Exception {
        throw new Exception( this.nome + " não existe");
    }
}
