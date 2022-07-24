import java.util.Scanner;
class CustomException extends Exception{
    public String toString(){
        return "Max attempts reached";
    }
}

public class PB14 {
    public static void main(String[] args) throws CustomException {
        Scanner s = new Scanner(System.in);
        /*
        try{
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("HAHA");
        }
        catch(IllegalArgumentException e){
            System.out.println("HEHE");
        }
        catch (Exception e ){
            System.out.println(e);
        }

         */
    int [] arr = new int[3];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    int  i = 0;
    boolean b = true;
    while(b && i < 5){
        try {
            System.out.println("Enter the value of array");
            int num = s.nextInt();
            System.out.println(arr[num]);
            break;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            i++;
        }
    }
    if(i==5) {
        throw new CustomException();
    }

      }
    }

