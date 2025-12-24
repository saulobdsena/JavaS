package Shapes;

public abstract class Shapes {

    Color color;

    public Shapes(Color color) {
        this.color = color;
    }

    public abstract Double area();
}
