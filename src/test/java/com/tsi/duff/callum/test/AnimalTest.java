package com.tsi.duff.callum.test;
import com.tsi.duff.callum.Animal;
import com.tsi.duff.callum.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void test_animal_age () {
        Animal TestAnimal = new Animal();
        TestAnimal.setAge(19);
        assertEquals(19, TestAnimal.getAge(), "The expected age was wrong");

    }
        @Test
    public void test_height(){
        Animal testAnimal = new Animal();
        testAnimal.setHeight(11);
        assertEquals(11, testAnimal.getHeight(), "The height is incorrect" );
        }

        @Test
    public void test_weight(){
        Animal testAnimal1 = new Animal();
        testAnimal1.setWeight(10);
        assertEquals(10, testAnimal1.getWeight(), "The weight is wrong");
        }

        @Test
    public void test_name(){
        Animal testAnimal2 = new Animal();
        testAnimal2.setName("Jermain");
        assertEquals("Jermain", testAnimal2.getName(), "the name is wrong");
        }

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
        assertEquals("I am eating tuna", cat3.whatTheCatisEating(), "The cat is not eating Tuna");
        }

    }



