import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        try {
            int num = sc.nextInt();
            System.out.println("Hello");
            try {
                System.out.println(arr[num]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception is there at level 2");
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("Exception at level 1");
            System.out.println(e);
        }
    }
}

