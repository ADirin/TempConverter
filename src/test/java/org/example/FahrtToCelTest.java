package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FahrtToCelTest {
 // initial method
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

    @Test
    void convertKeltoFarTest() {
        double test =Math.round(FahrtToCel.kelvinToFah(300.1));
        assertEquals(59.0, test);
    }
    }
