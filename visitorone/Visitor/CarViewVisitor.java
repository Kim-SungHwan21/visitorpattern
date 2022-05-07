package Visitor;

public class CarViewVisitor implements ViewVisitor {
    private final String BUS_STATUS = "현재 버스의 기름상태 : ";
    private final String TRUCK_STATUS = "현재 트럭의 기름상태 : ";

    @Override
    public String visit(Bus bus) {
        return BUS_STATUS + bus.getFuel();
    }

    @Override
    public String visit(Truck truck) {
        return TRUCK_STATUS + truck.getFuel();
    }
}
