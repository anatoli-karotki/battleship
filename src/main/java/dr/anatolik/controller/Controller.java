package dr.anatolik.controller;

import dr.anatolik.model.Grid;
import dr.anatolik.view.Printer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    private final Grid grid = new Grid();
    private final Printer printer = new Printer();


    public void startDialog() {
        System.out.println(printer.printGrid(grid));
        System.out.println("\nSelect number 0 - 99");
        int answer = getIntAnswer();
        grid.updateCell(answer);
        startDialog();
    }

    private static int getIntAnswer() {
        String inputString = getAnswer();
        return Integer.parseInt(inputString);
    }

    private static String getAnswer() {
        String inputString = "";
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            inputString = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString;
    }
}
