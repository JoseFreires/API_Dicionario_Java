package Functions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class managerFiles {

    public boolean managing(Map<String, String> apiData, String currentWord) throws IOException{
        if(createFiles(currentWord)){
            creatingAndWritingFile(apiData, currentWord);
        } else{
            System.out.println("It's not possible write on this file.");
        }
        
        return true;
    }

    public boolean creatingAndWritingFile(Map<String, String> apiData, String currentWord){
        // String path = "C:\\Users\\jose.freires\\Desktop\\Projects_Dev\\My Projects\\JavaProjects\\DicionarioJava\\files\\" + currentWord + ".txt";
        String path = "C:\\Users\\User\\Desktop\\Pastas\\Serious Things\\Folder_Developer\\Java\\Dicionario_Java\\files\\" + currentWord + ".txt" ;

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for(String key : apiData.keySet()){
                bw.write(key + ": " + apiData.get(key));
                bw.newLine();
            }
            System.out.println("Created and Writed!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return true;
    }

    public boolean createFiles(String currentWord) throws IOException{
        // try{
            
        //     // File path = new File("C:\\Users\\jose.freires\\Desktop\\Projects_Dev\\My Projects\\JavaProjects\\DicionarioJava\\files\\" + currentWord + ".txt");
        //     File path = new File("C:\\Users\\User\\Desktop\\Pastas\\Serious Things\\Folder_Developer\\Java\\Dicionario_Java\\files\\" + currentWord + ".txt");

        //     if(path.createNewFile()){
        //         System.out.println("Created!");
        //         return true;
        //     } else {
        //         System.out.println("Already exists");
        //         return false;
        //     }

        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        //     return false;
        // }

        return true;

    }
}
