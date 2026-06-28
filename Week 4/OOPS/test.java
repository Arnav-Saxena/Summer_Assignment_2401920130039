// Define interface named 'test'
interface test {
    int square(int val);
}

// Arithmetic class implementing 'test'
class Arithmetic implements test {
    @Override
    public int square(int val) {
        return val * val;
    }
}

// Class ToTestInt that uses the Arithmetic object
class ToTestInt {
    public static void main(String[] args) {
        Arithmetic arithmeticObj = new Arithmetic();
        int result = arithmeticObj.square(5);
        System.out.println("Square of 5 is: " + result);
    }
}