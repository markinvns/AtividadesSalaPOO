import java.util.Scanner;
/**
 *
 * @author marcu
 */
public class Usuario {
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private byte receita;
    private double valor;
    
    public static void consultaMedicamento(){
        System.out.println("Destinado a consultar um medicamento");
    }
    public static void comprarMedicamento(){
        System.out.println("Destinado a compra de medicamentos");
    }
    public static void efetuaPagamento(){     
        System.out.println("Destinado a efetuação de pagamentos");
    }
    public static double calculoImposto(double valor){
        if (valor >= 100.00) {
          double val_imposto = valor * 0.15;
            System.out.println("O valor do imposto do medicamento séra:R$" + val_imposto);
        }else{
          double val_imposto = valor * 0.10;
            System.out.println("O valor do imposto do medicamento séra:R$" + val_imposto);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do medicamento:");
        String nome = scan.nextLine();
        scan.nextLine();
        System.out.println("Digite o valor do medicamento:");
        int valor = scan.nextInt();
        scan.nextLine();
        calculoImposto(valor);
    }
    
    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public String email(){
        return this.email;
    }
    public byte receita(){
        return this.receita;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setReceita(byte receita){
        this.receita = receita;
    }
}
