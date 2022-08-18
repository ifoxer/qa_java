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
public class CatTest {
    Cat cat;

@Mock
    private Feline feline;

@Before
    public void setUp() {
    cat = new Cat(feline);
}

@Test
    public void testGetSound() {
    String actual = "Мяу";
    String expected = cat.getSound();

    assertEquals(expected, actual);
}

@Test
    public void testGetFood() throws Exception {
    List<String> expected = List.of("мясо", "птица", "рыба");
    when(feline.eatMeat()).thenReturn(expected);
    List<String> actual = cat.getFood();

    assertEquals(expected, actual);
}






}