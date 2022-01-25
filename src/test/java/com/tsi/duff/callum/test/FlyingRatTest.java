package com.tsi.duff.callum.test;
import com.tsi.duff.callum.FlyingRat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyingRatTest {

    @Test
    void test_flyingrat_takeoff(){
        FlyingRat flyingrat = new FlyingRat();
        flyingrat.takeOffMethod();
        assertEquals(flyingrat.getTakeOffMethod(), "flap wings and move legs to start flying", "take off method is wrong");
    }

    @Test
    void test_flyingrat_flying(){
        FlyingRat flyingrat1 = new FlyingRat();
        flyingrat1.flying();
        assertEquals(flyingrat1.getFlying(), "keep flapping wings and glide through the air", "flying method is wrong");
    }

    @Test
    void test_flyingrat_touchdown(){
        FlyingRat flyingrat2 = new FlyingRat();
        flyingrat2.touchdown();
        assertEquals(flyingrat2.getTouchdown(), "stop flapping wings and land gently", "touchdown method is wrong");
    }

}
