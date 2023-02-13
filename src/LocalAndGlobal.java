public class LocalAndGlobal {
    public static void main(String[] args) {
        int global = 10;
        System.out.println(global);
        if (10>5) {
            int local = 3;
            System.out.println(global);
            System.out.println(local);
        }
        //System.out.println(local); //error
        System.out.println(global);
    }
}
