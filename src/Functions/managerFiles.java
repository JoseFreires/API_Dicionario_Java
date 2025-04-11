package functions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class managerFiles {

    public boolean managing(Map<String, String> apiData, String currentWord) throws IOException{
        if(createFiles(currentWord)){
            writingFile(apiData, currentWord);
        } else{
            System.out.println("It's not possible write on this file.");
        }
        
        return true;
    }

    public boolean writingFile(Map<String, String> apiData, String currentWord){
        String path = "C:\\Users\\jose.freires\\Desktop\\Projects_Dev\\My Projects\\JavaProjects\\DicionarioJava\\files\\" + currentWord + ".txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for(String key : apiData.keySet()){
                bw.write(key + ": " + apiData.get(key));
                bw.newLine();
            }
            System.out.println("Writed!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return true;
    }

    public boolean createFiles(String currentWord) throws IOException{
        try{
            
            File path = new File("C:\\Users\\jose.freires\\Desktop\\Projects_Dev\\My Projects\\JavaProjects\\DicionarioJava\\files\\" + currentWord + ".txt");

            if(path.createNewFile()){
                System.out.println("Created!");
                return true;
            } else {
                System.out.println("Already exists");
                return false;
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }

    }
}
