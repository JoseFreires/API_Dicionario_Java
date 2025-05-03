package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ItemHistory {
    private Integer indice;
    private String word;
    private LocalDateTime dateTimeHistory;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

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
        return ") " + word + " | Data: (" + dateTimeHistory.format(fmt) + ")";
    }

    
}
