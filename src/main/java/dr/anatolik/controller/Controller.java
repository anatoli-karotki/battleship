package dr.anatolik.controller;

import dr.anatolik.model.Grid;
import dr.anatolik.view.Printer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    private final Grid grid = new Grid(10);
    private final Printer printer = new Printer();


    public void startGame() {
        boolean continueGame = true;
        while (continueGame) {
            System.out.print(printer.printGrid(grid));
            System.out.print("\nSelect number 0 - 99 or 'STOP' to stop game ");
            String answer = getAnswer();
            if ("STOP".equalsIgnoreCase(answer)) {
                continueGame = false;
            } else {
                int cellNumber = getIntAnswer(answer);
                if (cellNumber == -1) {
                    System.out.println("WRONG NUMBER! Try again...");
                } else {
                    grid.updateCell(cellNumber);
                }
            }
        }
    }

    private static int getIntAnswer(String inputString) {
        int result;
        try {
            result = Integer.parseInt(inputString);
            if (result < 0 || result > 99) {
                result = -1;
            }
        } catch (NumberFormatException e) {
            result = -1;
        }
        return result;
    }

    private static String getAnswer() {
        String inputString = "";
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            inputString = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString.trim();
    }
}
