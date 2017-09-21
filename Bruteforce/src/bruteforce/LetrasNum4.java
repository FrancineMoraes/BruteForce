/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Senhas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LetrasNum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String possibi = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String juntar = "";
        String senha;

        System.out.print("Digite a sua senha: ");
        senha = entrada.nextLine();

        long ti = System.currentTimeMillis();
        TEST:
        for (int i = 0; i < possibi.length(); i++) {
            for (int j = 0; j < possibi.length(); j++) {
                for (int k = 0; k < possibi.length(); k++) {
                    for (int l = 0; l < possibi.length(); l++) {
                        juntar = possibi.charAt(i) + "" + possibi.charAt(j) + ""
                                + possibi.charAt(k) + "" + possibi.charAt(l);
                        if (juntar.equals(senha)) {
                            System.out.println("Sua senha é: " + juntar);
                            long tf = System.currentTimeMillis();
                            System.out.println(((tf - ti)/1000) + " segundos");
                            break TEST;
                        }
                    }
                }
            }
        }
    }

}
