package com.example.task09;

import com.example.universum.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class PlanetLifeValidatorTest {

    @Test
    public void shouldThrowExceptionWhenAvgOrbitalSpeedIsGreaterThanLightSpeed() {
        // given
        PlanetLifeValidator validator = new PlanetLifeValidator();
        Planet planet = examplePlanet();
        planet.setAvgOrbitalSpeed(Speed.createKmPerSecond("310000")); // Greater Than 299 792 458 m/s

        try {
            // when
            validator.canBeLife(planet);
            // then
            fail("It should throw Exception, because planet orbital speed can't be greater than light speed");
        } catch (InvalidPlanetSpeed e) {
            assertTrue(true);
        }
    }

    private Planet examplePlanet() {
        return new Planet("Very Speed Planet", RotationDirection.LEFT,
                Distance.createFromMeter(new BigDecimal("4879400")),
                new SiderealYear(new BigDecimal("87.96935")));
    }
}
