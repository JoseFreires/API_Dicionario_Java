package functions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class managerFiles {
    public boolean createFiles(Map<String, String> apiData){
        File path = new File("\\words\\" + apiData.get("word 1") + ".txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){

        

        } catch (IOException e){
            System.out.println(e.getMessage());
        }


        return true;
    }
}
