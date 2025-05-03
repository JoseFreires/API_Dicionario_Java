package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import API.connection;
import classes.ExecuteDictionary;
import classes.History;
import classes.ItemHistory;
import Functions.managerFiles;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String api = "https://api.dictionaryapi.dev/api/v2/entries/en/"; // Variavel que recebe o link da API
        String userAnswer =  "";
        History history = new History();

        while (userAnswer != "NÃO" || userAnswer != "N") {
            UI.clearScreen();
            UI.menuStart();
            System.out.print("\n");
            System.out.print("Qual palavra deseja conhecer? R: ");
            String currentWord = sc.nextLine();

            history.addItem(new ItemHistory(currentWord, LocalDateTime.now()));

            String json = new connection().connectAPI(api + currentWord);  // Passa nessa função o link da API junto com a palavra a pesquisar como parâmetro
            Map<String, String> apiData = new ExecuteDictionary().getWordInformation(json);

            UI.showingWords(history);

            if(apiData != null){
                managerFiles mf = new managerFiles();
                mf.managing(apiData, currentWord);
            } else{
                System.out.println("Nenhuma resposta da API.");
            }

            System.out.println("Deseja continuar?");
            userAnswer = sc.nextLine().toUpperCase();
        }
        

        sc.close();
    }
}
