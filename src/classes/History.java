package classes;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<ItemHistory> listWord = new ArrayList<>();

    public History() {
    }

    public History(List<ItemHistory> listWord) {
        this.listWord = listWord;
    }

    public List<ItemHistory> getListWord() {
        return listWord;
    }

    public void addItem(ItemHistory item){
        listWord.add(item);
    }

    public void removeItem(ItemHistory item){
        listWord.remove(item);
    }

    public void removeItemById(Integer posicao){
        listWord.remove(posicao);
    }
    
}
