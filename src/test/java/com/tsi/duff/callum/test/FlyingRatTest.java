package com.tsi.duff.callum.test;

import com.tsi.duff.callum.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyingRatTest {

    @Test
    public void test_cat_age(){
        Cat cat1 = new Cat();
        cat1.setCatAge(10);
        assertEquals(10, cat1.getCatAge(),"the cat is not 10");
    }

    @Test
    public void test_cat_sleeping(){
        Cat cat2 = new Cat();
        cat2.setSleep();
        assertEquals("I am asleep", cat2.setSleep(), "the cat must be awake");
    }

    @Test
    public void test_cat_eats(){
        Cat cat3 = new Cat();
        cat3.whatTheCatisEating();
        assertEquals("I am eating fish", cat3.whatTheCatisEating(), "The cat is not eating fish");
    }
}
