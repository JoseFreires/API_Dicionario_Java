package application;

import java.util.Map;
import java.util.Scanner;

import API.connection;
import functions.managerFiles;
import model.ExecuteDictionary;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String api = "https://api.dictionaryapi.dev/api/v2/entries/en/"; // Variavel que recebe o link da API
        // connection conn = new connection(); // Chama a classe que estabelece uma conexão com a API

        System.out.println("Bem-vindo ao Dicionário em Java!");
        System.out.print("Digite a palavra: ");
        String answer = sc.nextLine(); // Recebe a palavra que deseja buscar na API
        
        String json = new connection().connectAPI(api + answer);  // Passa nessa função o link da API junto com a palavra a pesquisar como parâmetro
        Map<String, String> apiData = new ExecuteDictionary().getWordInformation(json);

        if(apiData != null){
            managerFiles mf = new managerFiles();
            mf.managing(apiData, answer);
        } else{
            System.out.println("Deu ruim!");
        }

        sc.close();
    }
}
