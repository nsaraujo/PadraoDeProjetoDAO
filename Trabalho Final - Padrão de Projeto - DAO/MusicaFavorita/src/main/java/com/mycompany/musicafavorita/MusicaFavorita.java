/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.musicafavorita;

import java.util.Scanner;

/**
 *
 * @author 55649
 */
public class MusicaFavorita {

    public static void main(String[] args) {
        //MusicaDAO musicDAO = new IMusicaDAO();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1. Adicionar Musica");
            System.out.println("2. Ver Todas as Musicas");
            System.out.println("3. Incrementar Contagem de Salvamento");
            System.out.println("0. Sair");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (option) {
                case 1:
                    System.out.println("Titulo da Musica: ");
                    String title = scanner.nextLine();
                    System.out.println("Artista: ");
                    String artist = scanner.nextLine();
                    Musica music = new Musica(title, artist);
                    //musicDAO.addMusic(music);
                    System.out.println("Musica adicionada!");
                    break;
                case 2:
                    System.out.println("Musicas Salvas:");
                    /*for (Musica m : musicDAO.getAllMusic()) {
                        System.out.println(m.getTitle() + " - " + m.getArtist() + " (Salva " + m.getSaveCount() + " vezes)");
                    }*/
                    break;
                case 3:
                    System.out.println("Titulo da Musica para incrementar contagem:");
                    String titleToIncrement = scanner.nextLine();
                    //musicDAO.incrementSaveCount(titleToIncrement);
                    System.out.println("Contagem incrementada!");
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (option != 0);

        scanner.close();
    }
}
