public class TestInterfaceLab {
   public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(15);

        int Flag = c1.compareTo(c2);
        switch (Flag) {
            case  1:
                System.out.println("The max circle's radius is " + c1.getRadius());
                break;
            case -1:
                System.out.println("The max circle's radius is " + c2.getRadius());
                break;
            case  0:
                System.out.println("Both circles have the same radius");
                break;
        }
    }
}