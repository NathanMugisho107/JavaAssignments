package assignment;

public class BlockExample {

    public static void main(String[] args) {
        {
            int studentNumber = 134671;
            int otherNumber = 50;
            int sum = studentNumber + otherNumber;
            System.out.println("Sum inside block: " + sum);
        }//End of block
        // Trying to access the variables here would cause an error
        // System.out.println(studentNumber); // Uncommenting this line will cause a compile-time error
        // System.out.println(otherNumber);
        System.out.println("Variables studentNumber and otherNumber are not accessible outside the block.");
    }
}

