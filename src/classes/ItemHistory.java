package classes;

import java.time.LocalDateTime;

public class ItemHistory {
    private String word;
    private LocalDateTime dateTimeHistory;

    public ItemHistory() {
    }

    public ItemHistory(String word, LocalDateTime dateTimeHistory) {
        this.word = word;
        this.dateTimeHistory = dateTimeHistory;
    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public LocalDateTime getDateTimeHistory() {
        return dateTimeHistory;
    }
    public void setDateTimeHistory(LocalDateTime dateTimeHistory) {
        this.dateTimeHistory = dateTimeHistory;
    }

    @Override
    public String toString() {
        return "Palavra: " + word + "| Data: (" + dateTimeHistory + ")";
    }

    
}
