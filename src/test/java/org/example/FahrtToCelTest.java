package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FahrtToCelTest {

    @Test
    void convertFahr() {
        float test = Math.round(FahrtToCel.convertFahr(20));

        assertEquals(-7.0, test);

        }

    }
