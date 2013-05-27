package visitor;

public interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Body body);
    void visit(Engine engine);
    void visit(Car car);
}
