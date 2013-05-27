package visitor;

public interface CarElement {
    void accept(CarElementVisitor carElementVisitor);
}
