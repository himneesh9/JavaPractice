class NegativeRadiusException extends Exception{
    public String toString(){
        return "Negative radius is not allowed";
    }
}

public class Throw_Thrwos {
    public static double area(int r ) throws NegativeRadiusException {
         if(r<0){
             throw new NegativeRadiusException();
         }
         else {
             return Math.PI * r * r;
         }
    }

    public static void main(String[] args)  {
       try {
           System.out.println(area(-1));
       }
       catch (Exception e){
           System.out.println(e);
       }
        System.out.println("Finished");
    }
}
