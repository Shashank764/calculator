import java.util.*;
import java.math.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("          CALCULATOR          ");
        System.out.println("------------------------------");
        System.out.println("operations you can perform...!\nAddition:'+'\nSubtraction:'-'\nMultiplication:'*'\nDivision:'/'\nPower:'^'\nModulus'%'\nFactorial:'!'\nClear:'C'\nExit:'X'\n------------------------------");
        String op;
        System.out.print("Enter the number: ");
        double a= sc.nextFloat();
        double b;
        double result=a;
        boolean cont=true;
        do{
            System.out.print("Enter the operation: ");
            op= String.valueOf(sc.next().toUpperCase().charAt(0));
            switch (op){
                case "+":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result+=b;
                    System.out.println("Answer: "+result);
                    break;
                case "-":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result-=b;
                    System.out.println("Answer: "+result);
                    break;
                case "*":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result*=b;
                    System.out.println("Answer: "+result);
                    break;
                case "/":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result/=b;
                    System.out.println("Answer: "+result);
                    break;
                case "^":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result=Math.pow(result,b);
                    System.out.println("Answer:- "+result);
                    break;
                case "%":
                    System.out.print("Enter the number: ");
                    b= sc.nextFloat();
                    result%=b;
                    System.out.println("Answer: "+result);
                    break;
                case "!":
                    double f= result;
                    double fact=1;
                    for(int i=1;i<=f;i++){
                        fact*=i;
                    }
                    result=fact;
                    System.out.println("Answer: "+(int)result);
                    break;
                case "C":
                    result=0;
                    System.out.print("Enter the number: ");
                    double a2= sc.nextDouble();
                    result=a2;
                    break;
                case "X":
                    cont=false;
                    break;
                default:
                    System.out.println("Invalid Operation...!");
                    break;
            }
        }while(cont);
    }
}
