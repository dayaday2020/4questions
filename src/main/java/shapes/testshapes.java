package shapes;

public class testshapes {
    public static void main(String[] args) {
        triangle  tri1 = new triangle(5,15,30,10);
        System.out.println(tri1.area() + "triangle area"+ "triangle perimeter");

        square square4 = new square(4);
        System.out.println(square4.area() + square4.perimeter());
    }
}
