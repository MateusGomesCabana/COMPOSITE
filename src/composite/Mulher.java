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

    ArrayList<Pessoa> novasPessoas = new ArrayList<Pessoa>();

    public Mulher(String tipo) {
        this.tipo = tipo;

    }

    @Override
    public void adicionarFilho(Pessoa novaPessoa) {
        this.novasPessoas.add(novaPessoa);
    }
}