// Base class Box
class Box {
    protected double length;
    protected double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

// Subclass Box3d extending Box
class Box3d extends Box {
    private double height;

    public Box3d(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getArea() {
        // Total surface area of a 3D Box: 2*(lb + bh + hl)
        return 2 * (length * breadth + breadth * height + height * length);
    }

    public double getVolume() {
        return length * breadth * height;
    }
}

class TestBox {
    public static void main(String[] args) {
        Box3d myBox3d = new Box3d(4.0, 5.0, 6.0);
        System.out.println("Box3D Surface Area: " + myBox3d.getArea());
        System.out.println("Box3D Volume: " + myBox3d.getVolume());
    }
}