import java .util.Scanner;
public class Aula3 {
    public static void main(String[] args){
        System.out.println("digite o primeiro numero");

    Scanner entrada = new Scanner (System.in);

    int num1 = entrada.nextInt();

    System.out.println("digite o segundo numero");
    int num2 = entrada.nextInt();
    int resultado = num1 + num2;

    System.out.println("resultado: " + resultado);
}
}



