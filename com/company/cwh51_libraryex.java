package com.company;
class library{
    String[]books;
    int no_of_books;
    library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addbook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+"has been added");
    }
    void showavaiablebooks(){
        for(String book :this.books){
            System.out.println("*"+book);
        }
    }
}

public class cwh51_libraryex {
    public static void main(String[] args) {
        library centrallibrary=new library();
        centrallibrary.addbook("na savu nenu sasth");


    }
}
