public class Operators {
    public static void main(String[] args) {
        //Basic arithmetic operators -, +, *, /, %
        int x = 100;
        x = x + 10;

        //Assignment operations = , -=, +=, *=, /=
        int a = 10;
        a = 20;
        a += 20;
        a *= 20;

        //Incrementation decrementation operators
        int i = 10;
        i++;
        ++i;
        System.out.println(i);

        //Post incrementation
        int num = 100;
        System.out.println(num++);
        System.out.println(num);

        //4 ways how to increase
        num = num + 1;
        num += 1;
        num++;
        ++num;

        //Relational operators
        //Equality ==, !=
        int p = 10;
        int k = 15;
        System.out.println("Equality " + (p==k));

        //Logical operation
        boolean sun = true;
        boolean dry = false;
        System.out.println(sun && dry);
        System.out.println(sun || dry);

    }
}
