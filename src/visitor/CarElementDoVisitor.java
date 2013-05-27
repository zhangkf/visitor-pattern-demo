package visitor;

public class CarElementDoVisitor implements CarElementVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("kicking my "+ wheel.getName() + " whell");
    }

    @Override
    public void visit(Body body) {
        System.out.println("moving my body");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("starting my engine");
    }

    @Override
    public void visit(Car car) {
        System.out.println("staring my car");
    }
}
