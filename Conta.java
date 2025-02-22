
/**
 *
 * @author marcus
 */
public class Conta {

    private double saldo;
    private String nome;


    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Acumula no saldo uma valor x + 10%
     * @param valor 
     */
    public void depositar(double valor, double percentual) {
        this.saldo = saldo + valor + ((percentual / 100) * valor);
    }
}
