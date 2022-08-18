package com.example;

public interface Kittens {

     default int getKittens(int kittensCount) {
        return kittensCount;
    }
}
