public class TestInterface {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Square(2), new Square(3), new Square(4.5), new Square(5), new Square(6)};
        for (GeometricObject object : objects) {
            System.out.println("Area: " + object.getArea());
            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }
        }
    }
}
