import java.util.Scanner;

public class PermissaoDirigr {
    public static void main(String[] args){

        System.out.print("Digite");

        Scanner entrada = new Scanner (System.in);
    
        int idade = entrada.nextInt();
        if(idade > 17){
             System.out.println("Já pode dirigir!");
        }else{
            System.out.println("vai de busão ou carona");
            
        } 

    }    // fim do main
}// fim da classe
   

