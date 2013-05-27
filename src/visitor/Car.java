package visitor;

public class Car implements CarElement {

    CarElement[] carElements;

    public Car() {
        this.carElements = new CarElement[]{new Wheel("1"), new Wheel("2"), new Wheel("3"), new Wheel("4"),
                                            new Body(), new Engine()};
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement carElement : carElements) {
            carElement.accept(visitor);
        }

        visitor.visit(this);
    }
}
