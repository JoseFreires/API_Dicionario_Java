package model;

import java.util.List;

public class Definition {
    private String definition;
    private List<String> synonyms;
    private List<String> antonyms;
    private String example;

    public Definition(String name, List<String> synonyms, List<String> antonyms, String example) {
        this.definition = name;
        this.synonyms = synonyms;
        this.antonyms = antonyms;
        this.example = example;
    }

    public String getName() {
        return definition;
    }
    public void setName(String name) {
        this.definition = name;
    }
    public List<String> getSynonyms() {
        return synonyms;
    }
    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }
    public List<String> getAntonyms() {
        return antonyms;
    }
    public void setAntonyms(List<String> antonyms) {
        this.antonyms = antonyms;
    }
    public String getExample() {
        return example;
    }
    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "Definition [name=" + definition + ", synonyms=" + synonyms + ", antonyms=" + antonyms + ", example=" + example
                + "]";
    }

    
    
}
