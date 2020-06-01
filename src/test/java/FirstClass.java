import org.testng.annotations.Test;


public class FirstClass {
    private int[] input;
    private int indexL;
    private int indexR;

    @Test
    public void test1() {

        System.out.println("initial run");
    }

    @Test
    public void test2() {

        int myNumber = 21;

        String statement1 = "there are many things to learn";

        String statement2 = myNumber + statement1;

        System.out.println(statement2);
    }

    @Test
    public void test3() {

        int a = 4;
        boolean b = a == 4;
        if (b) ;
        System.out.println("check the function");
    }

    @Test
    public void test4() {

        String a = "lets see how it works";
        String b = "let's see how it works";
        boolean c = a == b;

        System.out.println(c);

    }

    @Test
    public void test5() {

        int a = 5;

        if (a == 5)
            System.out.println("Ohhh! So a is 4!");
        else
            System.out.println("A IS NOT EQUAL TO 4");

    }

    @Test
    public void test6() {
        int[] arrayOfIntegers = {1, 9, 9, 5};

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int currentElement = arrayOfIntegers[i];
            System.out.println(currentElement);
        }
    }

    @Test
    public void test7() {

        int[] arr = {2, 0, 1, 3};
        for (int el : arr) {
            System.out.println(el);
        }
    }

    @Test
    public void test8() {

        int i;
        for (i = 0; i < 5; i++) {
            if (i >= 2) {
                break;
            }
            System.out.println("Yuhu");
        }
        System.out.println(i);
    }

    @Test
    public void testprintEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    @Test
    public void helloWorldPrintEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println("hello world");
        }
    }

    @Test
    public void testInput() {
        int[] input = {1, 9, 9, 5};
        printAllMembersOfArray(input);
    }

    public void printAllMembersOfArray(int[] arrayParameter) {
        for (int i = 0; i < arrayParameter.length; i++) {
            int currentElement = arrayParameter[i];
            System.out.println(currentElement);
        }
    }

     /* Swap two numbers in an array
     1. create an input array
     2. create a method with int[] parameter
     3. new method will take indexes of L and R elements
     4. use indexes R and L elements will be swapped with each other
     5. print out final version of the array  */

    @Test
    public void test_swap_Exception() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int indexL = 0;
        int indexR = 1;

        checkInputs(input, indexL, indexR);
        swap(input, indexL, indexR);
        printAllMembersOfArray(input);
    }

    //TODO: add checks for input array
    private void checkInputs(int[] input, int indexL, int indexR) {
        if (indexL >= 0 && indexL < input.length && indexR >= 0 && indexR < input.length) {
            System.out.println("Inputs are OK");
        } else {
            throw new AssertionError("Inputs are NOT OK: indexL=" + indexL + ", indexR=" + indexR);
        } }
    private void swap(int[] input, int indexL, int indexR) {
        int temporaryElement = 0;
        temporaryElement = input[indexL];
        input[indexL] = input[indexR];
        input[indexR] = temporaryElement;
    }

    // Exercise:
    // break down into sub-steps (external methods), 'letter' should be a parameter as well

    @Test
    public void testCountLetters() {
        String input = "hello world";
        int result = 0;

        char[] charArray = input.toCharArray();

        for (char eachChar : charArray) {
            if (eachChar == 'l') result++;
        }
        System.out.println(result);
    }




}





