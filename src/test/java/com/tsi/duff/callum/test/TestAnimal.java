package com.tsi.duff.callum.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.tsi.duff.callum.Animal;
import org.junit.jupiter.api.Test;

public class TestAnimal {

    @Test
    public void testAnimalAge() {
        Animal TestAnimal = new Animal();
        TestAnimal.setAge();
        assertEquals(19, TestAnimal.getAge(), "The expected age was wrong");

    }

    }



