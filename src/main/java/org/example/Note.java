package org.example;

public class Note {
    private int id; // Уникальный идентификатор заметки
    private String title; // Заголовок заметки
    private String text; // Текст заметки




    public Note(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    // Геттеры и сеттеры для полей id, title, и text
    // Методы equals() и hashCode() для сравнения заметок

    public void createNote(String title, String text) {
        // Создание новой заметки и добавление её в коллекцию заметок
    }

    public int getNoteById(String title, String text) {
        // Поиск заметки по уникальному идентификатору
        return id;
    }

    public void updateNote(int id, String title, String text) {
        // Обновление существующей заметки
    }

    public void deleteNote(int id) {
        // Удаление заметки по уникальному идентификатору
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
