package basics;

public class Loops {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            System.out.println(i + ". Hello world!");
        }
        for(int n = 0; n<=100; n += 10){
            System.out.print(n + " ");
        }

        //while loop
        int i = 1;
        System.out.println("");
        while(i < 11){
            System.out.println(i + " This is a do while loop");
            i++;
        }

        // do while
        i = 1;
        do {
            System.out.println(i + " This is a while loop");
            i++;
        } while (i <= 10);

        // break;
        for (int n = 0; n < 10; n++) {
            System.out.println("Hello World!");
            if (n == 1) {
                break;
            }
        }

        //continue goes to the next iteration
        for (int n = 0; n < 10; n++){
            if(n == 8){
                continue;
            }
            System.out.println(n);
        }
    }
}
