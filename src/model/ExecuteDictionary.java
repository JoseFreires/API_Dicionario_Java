package model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class ExecuteDictionary {

    public List<Word> getWordInformation(String json){
        
        Gson gson = new Gson();
        Type wordDataType = new TypeToken<List<Word>>(){}.getType();
        List<Word> wordData = gson.fromJson(json, wordDataType);

        for(Word item : wordData){
            System.out.println("Word: " + item.getWord());
            if(item.getMeanings() != null){
                for(Meanings meanings : item.getMeanings()){
                    System.out.println("Part of speech: " + meanings.getPartOfSpeech());
                    if(meanings.getDefinitions() != null){
                        for(Definition definition : meanings.getDefinitions()){
                            System.out.println("Definition: " + definition.getName());
                            if(definition.getExample() != null){
                                System.out.println("Example: " + definition.getExample());
                            }
                        }
                    }
                    System.out.println("-x-x-x-x-x-x-x-x-x-x-x-");
                }
                
            }
           
        }

        List<Word> teste = new ArrayList<>();

        return teste;
    }
}
