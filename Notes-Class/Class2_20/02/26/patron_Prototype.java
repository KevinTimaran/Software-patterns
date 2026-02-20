
// Interfaz necesaria para que el código funcione
interface Shape {
    Shape clone();
}

// Class implementing prototype shape
class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }
}


// Another class 
class patron_Prototype {
    public static void main(String[] args) {
        // create object of class circle
        Shape originalCircle = new Circle(5);

        // clone object from "originalCircle"
        Shape clonedCircle = originalCircle.clone();

        // draw from object cloned
        clonedCircle.draw();

        // Modify radius from object cloned
        ((Circle) clonedCircle).setRadius(8);
        clonedCircle.draw();
    }
}







