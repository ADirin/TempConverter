package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FahrtToCelTest {

    @Test
    void convertFahr() {
        int test = (FahrtToCel.convertFahr(32));

        assertEquals(0, test);

        }


        // Add in the class demo
    @Test
    void convertCel(){
         int test= (FahrtToCel.convertCel(20));
         assertEquals(68,test);
    }

    // Inclass exercise
    @Test
    void convertKel(){
        int test= (FahrtToCel.kelvintoCel(273));
        assertEquals(0,test);
    }
    }
