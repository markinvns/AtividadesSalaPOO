import java.util.Date;
import java.util.Scanner;

public class Data {
    
    public static void imprimirData(){
        Date objDate = new Date();
        System.out.println("A data de hoje em mil segundos é: " + objDate.getTime());
    }
    public static int numero(int n1, int n2){
        if (n1 > n2){
            System.out.println("O número maior é:" + n1);
        }else if(n1 == n2){
            System.out.println("Os números digitados são iguais");
        }
        else {
            System.out.println("O número maior é" + n2);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        //imprimirData();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o segundo número:");
        int n2 = scan.nextInt();
        scan.nextLine();
        numero(n1, n2); 
    }
}


