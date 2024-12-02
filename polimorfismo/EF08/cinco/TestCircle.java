package polimorfismo.EF08.cinco;

public class TestCircle {
    public static void main(String[] args) {
        Circle circulo = new Circle(5.0);
        System.out.printf(circulo.toString());
        System.out.println(circulo.getArea());
        System.out.println(circulo.getPerimeter());
    }
}
