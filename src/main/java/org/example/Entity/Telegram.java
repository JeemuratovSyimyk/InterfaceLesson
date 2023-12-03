package org.example.Entity;

import org.example.Service.AudioMessenger;
import org.example.Service.Messenager;

public class Telegram extends SocialMedia implements Messenager, AudioMessenger {
    public Telegram(String name) {
        super(name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void answerTOMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void audioMesseg() {
        System.out.println(" Sending audio message " + getName());

        }
    }