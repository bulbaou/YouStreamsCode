package edu.streams.library;

/**
 * Класс {@code Grade} представляет собой оценку. Данный класс может быть
 * использован для того что бы задать соответствие букв и цифр между собой
 * например 5 это "отлично". Строковая форма содержит только текст. 
 * В целом класс не накладывает никаких ограничений на содержание и позволяет
 * в любой момент менять значения.
 *
 * @author  Ermakov Alexander
 */
public class Grade {
    private int num;
    private String text;
    /**
     * Создание нового {@code Grade} возможно только с указанием 
     * двух значений.
     *
     * @param  num
     *         числовая форма оценки
     * @param  text
     *         строковая форма оценки
     */
    public Grade(int num, String text) {
        this.num = num;
        this.text = text;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
    
    
    
}
