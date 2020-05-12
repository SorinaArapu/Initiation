import org.testng.annotations.Test;

public class FirstClass {
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


}

