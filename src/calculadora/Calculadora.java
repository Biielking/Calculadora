package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor desejado :");
        Double num1 = in.nextDouble();
        
        System.out.println("Digite o valor desejado :");
        Double num2 = in.nextDouble();
        
        System.out.println("Selecione o Operador (+,-,*,/)");
        char operador = in.next().charAt(0);
        in.close();
        
        double result;
        
        switch(operador){
            
        case '+':
            result = num1 + num2 ;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break;
        default:
            System.out.println("Operação invalida.");
            return;
    }
        
        System.out.println(num1+" "+operador+" "+num2+": "+result);
    }
    
}
