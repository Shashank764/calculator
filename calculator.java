import java.util.*;
import java.math.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("          CALCULATOR          ");
        System.out.println("------------------------------");
        System.out.println("operations you can perform...!\nAddition:'+'\nSubtraction:'-'\nMultiplication:'*'\nDivision:'/'\nPower:'^'\nModulus'%'\nFactorial:'!'\n------------------------------");
        String op;
        System.out.print("Enter the number: ");
        double a= sc.nextFloat();
        double b;
        double result=a;
        boolean cont=true;
        do{
            System.out.print("Enter the operation: ");
            op= String.valueOf(sc.next().charAt(0));
            switch (op){
                case "+":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result+=b;
                    System.out.println("Answer:- "+result);
                    System.out.println("Want to continue...(Y/N)");
                    String x= sc.next().toUpperCase();
                    if(x.equals("N")){
                        cont=false;
                    }
                    break;
                case "-":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result-=b;
                    System.out.println("Answer:- "+result);
                    System.out.println("Want to continue...(Y/N)");
                    String x1= sc.next().toUpperCase();
                    if(x1.equals("N")) {
                        cont = false;
                    }
                    break;
                case "*":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result*=b;
                    System.out.println("Answer:- "+result);
                    System.out.println("Want to continue...(Y/N)");
                    String x3= sc.next().toUpperCase();
                    if(x3.equals("N")) {
                        cont = false;
                    }
                    break;
                case "/":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result/=b;
                    System.out.println("Answer:- "+result);
                    System.out.println("Want to continue...(Y/N)");
                    String x4= sc.next().toUpperCase();
                    if(x4.equals("N")){
                        cont=false;
                    }
                    break;
                case "^":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result=Math.pow(result,b);
                    System.out.println("Answer:- "+result);
                    System.out.println("Want to continue...(Y/N)");
                    String x5= sc.next().toUpperCase();
                    if(x5.equals("N")) {
                        cont = false;
                    }
                    break;
                case "%":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result%=b;
                    System.out.println("Answer:- "+result);
                    System.out.println("Want to continue...(Y/N)");
                    String x6= sc.next().toUpperCase();
                    if(x6.equals("N")) {
                        cont = false;
                    }
                    break;
                case "!":
                    double f= result;
                    double fact=1;
                    for(int i=1;i<=f;i++){
                        fact*=i;
                    }
                    result=fact;
                    System.out.println("Answer:- "+(int)result);
                    System.out.println("Want to continue...(Y/N)");
                    String x7= sc.next().toUpperCase();
                    if(x7.equals("N")) {
                        cont = false;
                    }
                    break;
                default:
                    System.out.println("Invalid Operation...!");
                    break;
            }
        }while(cont);
    }
}
