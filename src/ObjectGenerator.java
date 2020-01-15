public class ObjectGenerator {

    public void printTriangle(int baseSize, boolean upright){
        int stars;
        int bottomSize;
        int nextLine;

        if (upright == true){
            stars = 1;
            bottomSize = baseSize;
            nextLine = 2;
        }
        else {
            stars = 19;
            bottomSize = -1;
            nextLine = -2;
        }

        do{
            printReps(" ",(baseSize - stars)/2);
            printReps("*",stars);
            printReps(" ",(baseSize - stars)/2);
            System.out.println("\n");
            stars = stars + nextLine;
        }while (stars != bottomSize);
    }

    public void printGrid(int x, int y){

        System.out.print("     ");

        for (int k = 0; k < x; k++) {
            int blanks = 4 - Integer.toString(k+1).length();
            printReps(" ",blanks);
            System.out.print(k+1);
        }

        System.out.print("\n");

        System.out.print("-----");
        printReps("----",x);

        String output;

        for (int i = 0; i < y; i++) {

            System.out.print("\n");
            System.out.print("  " + (i+1) + " |");

            for (int j = 0; j < x; j++) {

                output = Integer.toString((i + 1) * (j + 1));
                int blanks = 4 - output.length();
                printReps(" ",blanks);
                System.out.print(output);

            }

        }

    }

    public void printReps(String string, int number){

        for (int i = 0; i < number; i++) {
            System.out.print(string);
        }

    }
}
