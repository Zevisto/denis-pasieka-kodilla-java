package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    Country polska = new Country(new BigDecimal("2000000"), "Polska");
    Country niemcy = new Country(new BigDecimal("100000"), "Niemcy");
    Country francja = new Country(new BigDecimal("10000"), "Francja");
// 2110000
    Country rosja = new Country(new BigDecimal("25000000"), "Rosja");
    Country chiny = new Country(new BigDecimal("1000000000"), "Chiny");
    Country indie = new Country(new BigDecimal("5000000"), "Indie");
// 1030000000
    Country kongo = new Country(new BigDecimal("120000"), "Kongo");
    Country rpa = new Country(new BigDecimal("100000"), "RPA");
    Country egipt = new Country(new BigDecimal("8000000"), "Egipt");
// 8220000
    @Test
    public void testGetPeopleQuantity() {
        Continent europa = new Continent();
        europa.addCountry(polska);
        europa.addCountry(niemcy);
        europa.addCountry(francja);
        Continent azja = new Continent();
        azja.addCountry(rosja);
        azja.addCountry(chiny);
        azja.addCountry(indie);
        Continent afryka = new Continent();
        afryka.addCountry(kongo);
        afryka.addCountry(rpa);
        afryka.addCountry(egipt);
        World world = new World();
        world.addContinent(europa);
        world.addContinent(azja);
        world.addContinent(afryka);
// 2110000 + 1030000000 + 8220000 = 1040330000
        BigDecimal amountOfPeople = world.getPeopleQuantity();
        BigDecimal expectedValue = new BigDecimal ("1040330000");
        Assert.assertEquals(amountOfPeople, expectedValue);
    }
}