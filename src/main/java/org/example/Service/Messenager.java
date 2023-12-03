package org.example.Service;

public interface Messenager {

    void sendMessage(String message);
    void answerTOMessage(String message);
    default void method(){
        System.out.println("default");
    }
    static void method1() {

    }
}
