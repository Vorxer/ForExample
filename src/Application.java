public class Application {
    public static void main(String[] args) {
        ObjectGenerator objectGenerator = new ObjectGenerator();
        objectGenerator.printTriangle(19,true);
        objectGenerator.printTriangle(19,false);

        objectGenerator.printGrid(9,9);
    }



}
