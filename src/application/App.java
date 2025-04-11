package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import API.connection;
import classes.ExecuteDictionary;
import classes.History;
import classes.ItemHistory;
import functions.managerFiles;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String api = "https://api.dictionaryapi.dev/api/v2/entries/en/"; // Variavel que recebe o link da API
        String userAnswer =  "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        while (userAnswer != "NÃO" || userAnswer != "N") {
            UI.menuStart("Bem-vindo ao Dicionário em Java");
            System.out.print("\n");
            System.out.print("Qual palavra deseja conhecer? R:");
            String currentWord = sc.nextLine();

            History history = new History();
            history.addItem(new ItemHistory(currentWord, LocalDateTime.now()));

            String json = new connection().connectAPI(api + currentWord);  // Passa nessa função o link da API junto com a palavra a pesquisar como parâmetro
            Map<String, String> apiData = new ExecuteDictionary().getWordInformation(json);

            if(apiData != null){
                managerFiles mf = new managerFiles();
                mf.managing(apiData, currentWord);
            } else{
                System.out.println("Nenhuma resposta da API.");
            }

            UI.showingWords();

            System.out.println("Deseja continuar?");
            userAnswer = sc.nextLine().toUpperCase();
            UI.clearScreen();
        }
        

        sc.close();
    }
}
