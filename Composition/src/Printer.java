/**
 * Created by Dagoberto on 07/02/2017.
 */
public class Printer {

    private int tonerLevel;
    private int printedPages;
    private boolean duplex;

    public Printer(int tonerLevel, int printedPages, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.printedPages = printedPages;
        this.duplex = duplex;
    }

    public boolean isDuplex() {
        return duplex;

    }

    public void fillUp(int fill){
        if((this.tonerLevel+fill)>100){
            System.out.println("Maximum toner capacity reached");

        }
        else{
            this.tonerLevel = this.tonerLevel+fill;
            System.out.println("Toner level now is: "+this.tonerLevel);
        }
    }

    public void print(int pages){
        this.printedPages = this.printedPages+pages;
        System.out.println("Number of printed pages: "+this.printedPages);
    }

}
