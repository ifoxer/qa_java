import com.example.Feline;
import com.example.Kittens;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Kittens kittens;

    @Test
    public void testGetKittensWhen(){
        Lion lion = new Lion(kittens);
        Mockito.when(kittens.getKittens(2)).thenReturn(6);
        System.out.println(lion.getKittens(2));
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(new Feline());
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHasManeElse() throws Exception {
        try {
            Lion lion = new Lion("test");
            lion.doesHaveMane();
        }catch (Exception e){
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }


}
