package visitor;

public class Main {
    public static void main(String[] args) {
        NovelBook novelBook = new NovelBook("데미안");
        int memberPrice = novelBook.acceptPrice(new MemberVIsitor());
        int guestPrice = novelBook.acceptPrice(new GuestVisitor());

        System.out.println("소설 회원가: " + memberPrice);
        System.out.println("손님 회원가: " + guestPrice);

        WorkBook workBook = new WorkBook("수학문제집");
        memberPrice = workBook.acceptPrice(new MemberVIsitor());
        guestPrice = workBook.acceptPrice(new GuestVisitor());

        System.out.println("소설 회원가: " + memberPrice);
        System.out.println("손님 회원가: " + guestPrice);
    }
}
