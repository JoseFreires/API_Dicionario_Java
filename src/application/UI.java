package application;

import java.util.List;
import java.util.Scanner;

import classes.History;
import classes.ItemHistory;

public class UI {
    Scanner sc = new Scanner(System.in);

    // Para limpar o prompt de comando
    public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

    public static void menuStart(){
        int tamanhoMenu = 35;
        // Gera o topo do menu
        for(int lineUp = 0; lineUp <= tamanhoMenu; lineUp++){
            if(lineUp == tamanhoMenu){
                System.out.println("---");
            } else{
                System.out.print("-");
            }
        
        }

        for(int wall = 0; wall <= 4; wall++){
            System.out.print("|");
            if(wall == 2){
                for(int space = 0; space <=4; space++){
                    System.out.print(" ");
                }

                System.out.println("Bem-vindo ao Dicionário!");
                
                for(int space = 0; space <=3; space++){
                    System.out.print(" ");
                }
            } else{
                for(int space = 0; space <= tamanhoMenu; space++){
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        // Gera a base do menu
        for(int roof = 0; roof <= tamanhoMenu; roof++){
            System.out.print("-");
        }
    }

    public static void showingWords(History history){
        int indice = 0;
        System.out.println("---------------------------------------");
        System.out.println("Abaixo segue o histórico de palavras: ");
        for(ItemHistory itemHistory : history.getListWord()){
            indice++;
            System.out.println(indice + itemHistory.toString());
        }
        System.out.println("---------------------------------------");
    }

}
