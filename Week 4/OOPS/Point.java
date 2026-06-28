class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Setter for X
    public void setX(int x) {
        this.x = x;
    }

    // Setter for Y
    public void setY(int y) {
        this.y = y;
    }

    // Setter for both X and Y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void displayPoint() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}