package model;

import java.util.List;

public class ListWords {
    List<String> listWord;

    public ListWords(List<String> listWord) {
        this.listWord = listWord;
    }

    public List<String> getListWord() {
        return listWord;
    }

    public void addItem(String item){
        listWord.add(item);
    }
    
}
