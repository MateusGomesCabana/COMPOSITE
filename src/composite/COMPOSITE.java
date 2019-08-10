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
public class COMPOSITE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa mae = new Mulher("Mae");
        Pessoa pai = new Homens("pai");
        Pessoa filho = new Homens("filho");

        try {
            pai.adicionarFilho(filho);;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            mae.adicionarFilho(pai);
            mae.adicionarFilho(filho);
            mae.getTipo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {

            mae.getPessoa(mae.getTipo()).getTipo();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
