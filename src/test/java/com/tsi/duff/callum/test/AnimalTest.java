package com.tsi.duff.callum.test;
import com.tsi.duff.callum.Animal;
import com.tsi.duff.callum.Cat;
import com.tsi.duff.callum.FlyingRat;
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

    }



