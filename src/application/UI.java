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

    public static void menuStart(String title){
        int tamanhoMenu = title.length()+8;

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
                System.out.print(title);
                
                for(int space = 0; space <=3; space++){
                    System.out.print(" ");
                }
            } else{
                for(int space = 0; space <=tamanhoMenu; space++){
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        for(int roof = 0; roof <= tamanhoMenu; roof++){
            System.out.print("-");
        }
    }

    public static void showingWords(){
        History history = new History();

        for(ItemHistory itemHistory : history.getListWord()){
            itemHistory.toString();
        }
    }

}
