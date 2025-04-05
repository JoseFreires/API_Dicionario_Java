package application;

import java.util.Scanner;

import API.connection;
import model.ExecuteDictionary;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String api = "https://api.dictionaryapi.dev/api/v2/entries/en/"; // Variavel que recebe o link da API

        System.out.println("Bem-vindo ao Dicionário em Java!");
        System.out.print("Digite a palavra: ");
        String answer = sc.nextLine(); // Recebe a palavra que deseja buscar

        connection conn = new connection(); 
        String json = conn.connectAPI(api + answer); 
        ExecuteDictionary dic = new ExecuteDictionary();
        dic.getWordInformation(json);
        

        sc.close();
    }
}
