package com.example.task09;

import com.example.universum.Gas;
import com.example.universum.Planet;

import java.math.BigDecimal;

public class PlanetLifeValidator {

    private final BigDecimal lightSpeed = new BigDecimal("299792458");  // m/s

    public boolean canBeLife(Planet planet) throws InvalidPlanetSpeed {
        if (planet.getAvgOrbitalSpeed().getMeterPerSecond().compareTo(lightSpeed) > 0) {
            throw new InvalidPlanetSpeed("Speed ist greater than light speed");
        }
        return planet.getAtmosphereGases().contains(Gas.OXYGEN)
                && planet.getAtmosphereGases().contains(Gas.CARBON_DIOXIDE);
    }
}
