public class B_Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.println("a * b = " + e);
        System.out.println("a / b = " + f);
        System.out.println("a % b = " + g);

        // Assignment Operators
        int h = 1;
        h += 1;
        System.out.println("h = " + h);
        h -= 1;
        System.out.println("h = " + h);
        h *= 1;
        System.out.println("h = " + h);
        h /= 1;
        System.out.println("h = " + h);
        h %= 1;
        System.out.println("h = " + h);

        // Comparison Operators
        int i = 1;
        int j = 2;
        boolean k = i == j;
        boolean l = i != j;
        boolean m = i > j;
        boolean n = i < j;
        boolean o = i >= j;
        boolean p = i <= j;
        System.out.println("i == j = " + k);
        System.out.println("i != j = " + l);
        System.out.println("i > j = " + m);
        System.out.println("i < j = " + n);
        System.out.println("i >= j = " + o);
        System.out.println("i <= j = " + p);

        // Logical Operators
        boolean q = true;
        boolean r = false;
        boolean s = q && r;
        boolean t = q || r;
        boolean u = !q;
        System.out.println("q && r = " + s);
        System.out.println("q || r = " + t);
        System.out.println("!q = " + u);
    }
}
