public class C_Conditionals {
    public static void main(String[] args) {
        //if
        int a = 1;
        if (a == 1) {
            System.out.println("a is 1");
        }
        //else
        if (a == 2) {
            System.out.println("a is 2");
        } else {
            System.out.println("a is not 2");
        }
        //else if
        if (a == 3) {
            System.out.println("a is 3");
        } else if (a == 4) {
            System.out.println("a is 4");
        } else {
            System.out.println("a is not 3 or 4");
        }
        //switch
        switch (a) {
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            default:
                System.out.println("a is not 1 or 2");
                break;
        }
        //ternary
        String b = (a == 1) ? "a is 1" : "a is not 1";
        System.out.println(b);

    }
}
