import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume () {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void reduceVolume() {
        assertEquals(90, waterBottle.loseVolume());
    }

    @Test
    public void zeroVolume(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fullVolume(){
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }

    }