class OuterClass {
    public void display() {
        System.out.println("Display method of OuterClass");
    }

    // Inner class definition
    class Inner {
        public void display() {
            System.out.println("Display method of Inner class");
        }
    }
}

class TestNestedDisplay {
    public static void main(String[] args) {
        // Calling Outer class display
        OuterClass outerObj = new OuterClass();
        outerObj.display();

        // Calling Inner class display
        OuterClass.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}