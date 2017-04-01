package Main;

import Events.DataSeeder;
import Input.InputReader;

public class Main {

    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
      //  inputReader.readInput();
        DataSeeder data = new DataSeeder();
        data.generateData();
    }
}
