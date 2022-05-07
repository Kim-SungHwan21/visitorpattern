import domain.Customer;
import element.NovelBookElement;
import element.WorkBookElement;
import java.util.ArrayList;
import java.util.List;
import visitor.PayGuestVisitor;
import visitor.PayMemberVisitor;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setGrade("guest");
        customer1.setElement(new NovelBookElement("셜록홈즈1권", 10000));

        Customer customer2 = new Customer();
        customer2.setGrade("member");
        customer2.setElement(new WorkBookElement("자바의 정석", 25000));

        PayGuestVisitor payGuestVisitor = new PayGuestVisitor();
        PayMemberVisitor payMemberVisitor = new PayMemberVisitor();

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        for (Customer customer : customers) {
            if (customer.getElement().getPart().equals("work")) {
                acceptAboutNovelBookElement(customer, payGuestVisitor, payMemberVisitor);
            } else if (customer1.getElement().getPart().equals("novel")) {
                acceptAboutWorkBookElement(customer, payGuestVisitor, payMemberVisitor);
            }
        }

        // 위의 for문이 아래의 주석을 한줄로만든것임, customers는 따로 레파지토리구현해서 생성자에서 add해주는게 바람직합니다.
//        if (customer1.getElement().getPart().equals("work")) {
//            acceptAboutNovelBookElement(customer1, payGuestVisitor, payMemberVisitor);
//        } else if (customer1.getElement().getPart().equals("novel")) {
//            acceptAboutWorkBookElement(customer1, payGuestVisitor, payMemberVisitor);
//        }
//
//        if (customer2.getElement().getPart().equals("work")) {
//            acceptAboutNovelBookElement(customer2, payGuestVisitor, payMemberVisitor);
//        } else if (customer2.getElement().getPart().equals("novel")) {
//            acceptAboutWorkBookElement(customer2, payGuestVisitor, payMemberVisitor);
//        }
    }

    private static void acceptAboutWorkBookElement(Customer customer,
                                                   PayGuestVisitor payGuestVisitor,
                                                   PayMemberVisitor payMemberVisitor) {
        if (customer.getGrade().equals("guest")) {
            System.out.println(customer.getElement().accept(payGuestVisitor));
        } else if (customer.getGrade().equals("member")) {
            System.out.println(customer.getElement().accept(payMemberVisitor));
        }
    }

    private static void acceptAboutNovelBookElement(Customer customer,
                                                    PayGuestVisitor payGuestVisitor,
                                                    PayMemberVisitor payMemberVisitor) {
        if (customer.getGrade().equals("guest")) {
            System.out.println(customer.getElement().accept(payGuestVisitor));
        } else if (customer.getGrade().equals("member")) {
            System.out.println(customer.getElement().accept(payMemberVisitor));
        }
    }
}
