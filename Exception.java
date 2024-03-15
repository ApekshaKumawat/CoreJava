public class Exception {

    public static float Divide(int num1, int num2) throws ArithmeticException{
        if(num2 == 0){
            throw new ArithmeticException("ArithmeticException : You are dividing by zero!!");
        }
        return num1/num2;
    }



    
    public static void main(String[] args){



        //Calling the Divide Method which is throwing exception
        System.out.println( Divide(12,0) );



    }
}
