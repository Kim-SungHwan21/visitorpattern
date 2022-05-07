package project.repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteData {
    private final Map<Integer, WaterCharge> dataParsers = new HashMap<>();

    public void writeFile() {//"Tariff_20220331.csv"
        //File file = new File("test2.txt");
        String line = "";
        try (BufferedWriter br = new BufferedWriter(new FileWriter("hi.txt"))) {
            br.write("NHN ACADEMY");
    } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
