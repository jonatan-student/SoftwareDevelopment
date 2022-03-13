public class Main {
    public static void main(String[] args) {
        Shapes Collection = new Shapes();
        Collection.addShape("circle", 1);
        Collection.addShape("rectangle", 1);
        Collection.addShape("triangle", 1);
        Collection.printCenters();
        Collection.printAreas();
        Collection.printPerimeter();
    }
}
