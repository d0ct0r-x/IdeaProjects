package com.tomlloyd;

public class Main {

    public static void main(String[] args) {
        Printer singlePrinter = new Printer(120, false);

        System.out.println("Toner level is " + singlePrinter.getTonerLevel());
        System.out.println("Number of printed pages is " + singlePrinter.getNumPagesPrinted());
        System.out.println("The result of checking if printer is Duplex is " + singlePrinter.getIsDuplex());
        System.out.println();

        singlePrinter.printPage(3);
        singlePrinter.fillToner(30);
        singlePrinter.printPage(3);
        singlePrinter.printPage(5);

        System.out.println("Number of printed pages is " + singlePrinter.getNumPagesPrinted());
        System.out.println();

        Printer doublePrinter = new Printer(50, true);

        System.out.println("Toner level is " + doublePrinter.getTonerLevel());
        System.out.println("Number of printed pages is " + doublePrinter.getNumPagesPrinted());
        System.out.println("The result of checking if printer is Duplex is " + doublePrinter.getIsDuplex());
        System.out.println();

        doublePrinter.printPage(3);
        doublePrinter.fillToner(30);
        doublePrinter.printPage(3);
        doublePrinter.printPage(5);

        System.out.println("Number of printed pages is " + doublePrinter.getNumPagesPrinted());
    }
}
