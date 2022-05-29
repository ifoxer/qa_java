package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Lion lion;

    @Mock
    private Feline feline;

    @Before
    public void setUp() {
        lion = new Lion(feline);
    }

    @Test
    public void getKittensTest() {
        int expected = 1;
        when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();

        assertEquals(expected,actual);
    }

    @Test
    public void doesHaveManeTest() {
        boolean isExpected = false;
        boolean isActual = lion.doesHaveMane();

        assertEquals(isExpected, isActual);
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expected = List.of("мясо", "птица", "рыба");
        when(feline.eatMeat()).thenReturn(expected);
        List<String> actual = lion.getFood();

        assertEquals(expected, actual);
    }

}