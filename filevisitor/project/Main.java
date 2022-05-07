package project;

import project.repository.ReadData;
import project.repository.WriteData;

public class Main {
    public static void main(String[] args) {
        ReadData readData = new ReadData();

        //readData.readFile();
        WriteData writeData = new WriteData();
        writeData.writeFile();
    }
}
