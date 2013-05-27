package visitor;

public class CarElementPrintVisitor implements CarElementVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("visiting "+ wheel.getName()+" wheel");
    }

    @Override
    public void visit(Body body) {
        System.out.println("visiting body");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("visiting engine");
    }

    @Override
    public void visit(Car car) {
        System.out.println("visiting car");
    }
}
