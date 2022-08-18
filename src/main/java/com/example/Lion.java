package com.example;

import java.util.List;

public class Lion {

    private Predator predator;
    private Kittens kittens;
    boolean hasMane;

    public Lion(Feline feline){
        this.predator = feline;
    }

    public Lion(Kittens kittens){
        this.kittens = kittens;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens(int kittenCount) {
        return kittens.getKittens(kittenCount);
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
