package model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.ObjAPI.Definition;
import model.ObjAPI.Meanings;
import model.ObjAPI.Word;

import java.lang.reflect.Type;

public class ExecuteDictionary {

    public Map<String, String> getWordInformation(String json){
        
        Map<String, String> receiveApi = new LinkedHashMap<>();
        Gson gson = new Gson();
        Type wordDataType = new TypeToken<List<Word>>(){}.getType();
        List<Word> wordData = gson.fromJson(json, wordDataType);

        Integer numberWord = 0;
        Integer numberPartOfSpeech = 0;

        for(Word item : wordData){
            numberWord++;
            receiveApi.put("Word (" + numberWord + ")", item.getWord());

            if(item.getMeanings() != null){
                for(Meanings meanings : item.getMeanings()){
                    numberPartOfSpeech++;
                    receiveApi.put("PartOfSpeech ("  + numberWord + "|" + numberPartOfSpeech + ")", meanings.getPartOfSpeech());

                    Integer numberDefinitions = 0;
                    Integer numberExamples = 0;
                    if(meanings.getDefinitions() != null){
                        for(Definition definition : meanings.getDefinitions()){
                            numberDefinitions++;
                            receiveApi.put("Definitions (" + numberWord + "|" + numberDefinitions + ")", definition.getName());

                            if(definition.getExample() != null){
                                numberExamples++;
                                receiveApi.put("Example (" + numberWord + "|" + numberExamples + ")", definition.getExample());
                            }
                        }
                    }
                }
                
            }
           
        }

        

        return receiveApi;
    }
}
