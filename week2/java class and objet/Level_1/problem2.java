class problem2 {
    double radius;

    public problem2(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayArea() {
        System.out.println("Area of the circle: " + calculateArea());
    }

    public void displayCircumference() {
        System.out.println("Circumference of the circle: " + calculateCircumference());
    }

    public static void main(String[] args) {
        problem2 circle = new problem2(5.0);
        circle.displayArea();
        circle.displayCircumference();
    }
}