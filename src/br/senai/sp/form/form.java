package br.senai.sp.form;


import java.util.Scanner;

public class form {
    public static void main (String[] args){

        /** Import da class scanner */

        Scanner teclado = new Scanner(System.in);


        System.out.print("Bom dia! Qual o nome de vocês?");
        String [] nomes = new String[2];
        nomes[0] = teclado.nextLine().toUpperCase();
        nomes[1] = teclado.nextLine().toUpperCase();


        System.out.print("Qual a idade de vocês?");
        int [] idades = new int[2];
        idades[0] = teclado.nextInt();
        idades[1] = teclado.nextInt();

        System.out.print("Qual o peso de vocês?");
        int [] pesos = new int[2];
        pesos[0] = teclado.nextInt();
        pesos[1] = teclado.nextInt();

        System.out.print("Qual a altura de vocês?");
        float [] alturas = new float[2];
        alturas[0] = teclado.nextFloat();
        alturas[1] = teclado.nextFloat();

        System.out.print("Qual o RG de vcs?");
        int [] rg = new int[2];
        rg[0] = teclado.nextInt();
        rg[1] = teclado.nextInt();

        System.out.print("Qual o CPF de vcs?");
        long [] cpf = new long[2];
        cpf[0] = teclado.nextLong();
        cpf[1] = teclado.nextLong();

        System.out.print("Qual a profissão de vcs?");
        String [] profissoes = new String[2];
        profissoes[0] = teclado.next().toUpperCase();
        profissoes[1] = teclado.next().toUpperCase();

        System.out.print("Qual o curso de vcs?");
        String [] cursos = new String[2];
        cursos[0] = teclado.next().toUpperCase();
        cursos[1] = teclado.next().toUpperCase();

        /** Printa as infos */

        System.out.println("------------------------------------------------");
        System.out.println("--------------- Formulario Prof 1---------------\n");
        System.out.println("       Olá, Professor " + nomes[0] + " Seja bem vindo!!");
        System.out.println("       Sua idade é: " + idades[0] + "anos");
        System.out.println("       Sua peso é: " + pesos[0] + "Kg");
        System.out.println("       Sua altura é: " + alturas[0] + "m");
        System.out.println("       Seu RG é: " + rg[0]);
        System.out.println("       Seu CPF é: " + cpf[0]);
        System.out.println("       Sua profissão é: " + profissoes[0]);
        System.out.println("       Sue curso é: " + cursos[0] + "\n");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------\n");

        System.out.println("------------------------------------------------");
        System.out.println("--------------- Formulario Prof 2---------------\n");
        System.out.println("       Olá, Professor " + nomes[1] + " Seja bem vindo!!");
        System.out.println("       Sua idade é: " + idades[1] + "anos");
        System.out.println("       Sua peso é: " + pesos[1] + "Kg");
        System.out.println("       Sua altura é: " + alturas[1] + "m");
        System.out.println("       Seu RG é: " + rg[1]);
        System.out.println("       Seu CPF é: " + cpf[1]);
        System.out.println("       Sua profissão é: " + profissoes[1]);
        System.out.println("       Sue curso é: " + cursos[1] + "\n");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------\n");


    }
}
