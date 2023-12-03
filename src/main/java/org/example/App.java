package org.example;

import org.example.Entity.FaceBook;
import org.example.Entity.Telegram;
import org.example.Entity.WatSapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FaceBook faceBook = new FaceBook("FaceBook");
        faceBook.sendMessage("Hello");
        faceBook.sendMessage("Hi");
        faceBook.audioMesseg();

        WatSapp watSapp = new WatSapp("WatSapp");
        watSapp.sendMessage("Wow are you");
        watSapp.sendMessage("I am okey");
        watSapp.audioMesseg();

        Telegram telegram = new Telegram("Telegram");
        telegram.sendMessage("What are you doing");
        telegram.answerTOMessage("I am studying");
        telegram.audioMesseg();
    }
}
