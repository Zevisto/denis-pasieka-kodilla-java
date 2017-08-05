package com.kodilla.stream.world;

import java.util.HashSet;;
import java.util.Set;

public class Continent {
    Set<Country> countryList = new HashSet<Country>();

    public Continent() {
        countryList = new HashSet<Country>();
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public Set<Country> getCountryList() {
        return countryList;
    }
}
