package com.tomlloyd;

public class Printer {

    private int tonerLevel = 0;
    private int numPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel >0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        this.numPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillToner (int newLevel) {
        if((this.tonerLevel + newLevel) <= 100) {
            this.tonerLevel += newLevel;
            System.out.println("Printer.fillToner(): New toner level is " + this.tonerLevel);
        }
    }

    public void printPage (int pages) {
        if(this.tonerLevel == 0) {
            System.out.println("Printer.printPage(): Failed. Not enough toner level.");
        } else if (pages <= 0) {
            System.out.println("Printer.printPage(): Failed. Number of pages is too low.");
        } else if (isDuplex) {
            int pagesPrinted = (pages + 1) / 2;
            System.out.println("Printer.printPage(): Printed " + pagesPrinted + " double-sided pages.");
            this.numPagesPrinted += pagesPrinted;
        } else {
            System.out.println("Printer.printPage(): Printed " + pages + " pages.");
            this.numPagesPrinted += pages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumPagesPrinted() {
        return numPagesPrinted;
    }

    public boolean getIsDuplex() {
        return isDuplex;
    }
}
