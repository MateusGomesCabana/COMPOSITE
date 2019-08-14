/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author ALUNO
 */
public class Mulher extends Pessoa {

    ArrayList<Pessoa> novasPessoas = new ArrayList<>();

    public Mulher(String nome) {
        this.nome = nome;

    }

    @Override
    public void adicionarFilho(Pessoa novaPessoa) {
        this.novasPessoas.add(novaPessoa);
    }

    public ArrayList<Pessoa> getNovasPessoas() {
        return this.novasPessoas;
    }

    @Override
    public Pessoa getPessoa(String nomeDaPessoa) throws Exception {
        for (Pessoa pessoa : this.novasPessoas) {
            if (pessoa.getName() == nomeDaPessoa) {
                return pessoa;
            }
        }
        throw new Exception("Não existe este arquivo");
    }

    @Override
    public void printNomeDaPessoa() {
        System.out.println(this.nome);
        for (Pessoa pessoa : novasPessoas) {
            pessoa.printNomeDaPessoa();
        }
    }
}
