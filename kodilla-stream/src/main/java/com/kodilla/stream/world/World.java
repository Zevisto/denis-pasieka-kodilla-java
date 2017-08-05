package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    Set<Continent> continentsList = new HashSet<Continent>();

    public World() {
        continentsList = new HashSet<Continent>();
    }

    public BigDecimal getPeopleQuantity() {
        return continentsList.stream()
                .flatMap(Continent -> Continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }

    public void addContinent(Continent continent) {
        continentsList.add(continent);
    }
}
