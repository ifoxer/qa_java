package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestParam {
    private final String chekedText;
    private final boolean isExpected;

    public LionTestParam(String chekedText, boolean isExpected){
        this.chekedText = chekedText;
        this.isExpected = isExpected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void test() throws Exception {
        Lion lion = new Lion(chekedText);
        boolean isActual = lion.hasMane;
        assertEquals(isExpected,isActual);
    }
}
