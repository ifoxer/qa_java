import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Cat cat;


    @Test
    public void testGetSound(){
        Cat cat = new Cat(new Feline());
        String actual = cat.getSound();
        String expected = "Мяу";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFoodWen() throws Exception {
        Mockito.when(cat.getFood()).thenReturn(List.of("ok"));
        System.out.println(cat.getFood());
    }

    @Test
    public void testGetFoodVerify() throws Exception {
        cat.getFood();
        cat.getFood();
        cat.getFood();
        Mockito.verify(cat, Mockito.times(3)).getFood();
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expected, actual);
    }
}
