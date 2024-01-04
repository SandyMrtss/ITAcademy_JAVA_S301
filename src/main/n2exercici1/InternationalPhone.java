package n2exercici1;

import java.io.*;
import java.util.*;

public class InternationalPhone implements Phone{

    private String phoneNumber;
    private static Map<String, String> countryPrefixesKey;
    private static final String currDir = System.getProperty("user.dir");
    private static final File countryPrefixes = new File(currDir + "/src/main/n2exercici1/CountryPrefixes.csv");
    static {
        countryPrefixesKey = new HashMap<>();
        try {
            Scanner myReader = new Scanner(countryPrefixes);
            myReader.nextLine();
            while (myReader.hasNextLine()){
                String[] values = myReader.nextLine().split(",");
                countryPrefixesKey.put(values[0].toUpperCase(), values[1]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error when trying to read CountryPrefixes.csv");
            ex.printStackTrace();
        }

    }

    public InternationalPhone(String country, int number) throws NoSuchFieldException{
        if(!countryPrefixesKey.containsKey(country)){
            throw new NoSuchFieldException("Country not found");
        }
        String prefix = countryPrefixesKey.get(country);
        this.phoneNumber = prefix.concat(String.valueOf(number)).replace(" ", "");
    }

    @Override
    public String showPhone(){
        return "Phone number: " + this.phoneNumber;
    }
    @Override
    public String toString() {
        return "PhoneNumber{" + phoneNumber + '}';
    }
}
