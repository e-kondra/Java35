package oop;

public class CallingCountryClass {
    public static void main(String[] args) {
        //Creating Country class object
        Country lithuania = new Country();

        lithuania.setName("Lithuania");
        lithuania.setPopulation(2801000);
        lithuania.setCapital("Vilnius");
        lithuania.setCurrency("EUR");
        lithuania.setInEU(true);

        lithuania.countryInfo();
        lithuania.isThisCountryInEU();
        System.out.println();

        Country china = new Country();

        china.setName("China");
        china.setPopulation(1454456803);
        china.setCapital("Beijing");
        china.setCurrency("CNY");
        china.setInEU(false);

        china.countryInfo();
        china.isThisCountryInEU();

    }
}
