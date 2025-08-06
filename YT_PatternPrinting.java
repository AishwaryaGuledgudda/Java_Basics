public class YT_PatternPrinting {
    // print the pattern

    public static void main(String[] args) {
        int totalRow=5;
        for(int row=1;row<=totalRow;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println("");
        }
    }
}
