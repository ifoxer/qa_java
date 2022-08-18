import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void testGetKittensVerify(){
        feline.getKittens(1);
        Mockito.verify(feline).getKittens(1);
    }

    @Test
    public void testGetKittensTimes(){
        feline.getKittens(1);
        feline.getKittens(1);
        Mockito.verify(feline, Mockito.times(2)).getKittens(1);
    }

    @Test
    public void testGetKittensAny(){
        feline.getKittens(34);
        Mockito.verify(feline).getKittens(Mockito.anyInt());
    }

    @Test
    public void testGetKittensWhenCount(){
        Mockito.when(feline.getKittens(2)).thenReturn(7);
        System.out.println(feline.getKittens(2));
    }

    @Test
    public void testGetKittens(){
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEatMeet() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }


}
