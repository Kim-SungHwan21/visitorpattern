package visitor;

public class Main {
    public static void main(String[] args) {

        Element[] elements = new Element[] {
            new BagElement(40000, "토트백"),
            new BagElement(10000, "백팩"),
            new ShoesElement(50000, "나이키", 210),
            new ShoesElement(100000, "아디다스", 270),
            new ShoesElement(150000, "리복", 280),
        };

        Visitor visitor = new CartVisitor();
        int totalPrice = 0;
        for (Element element : elements) {
            totalPrice += element.accept(visitor);
        }

        System.out.println("총 금액: " + totalPrice);

    }
}
