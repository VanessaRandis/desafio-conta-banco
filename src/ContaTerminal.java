public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private String ultimoNomeCliente;
    private float saldo;

    public ContaTerminal() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;

    }
    public void setUltimoNomeCliente(String ultimoNomeCliente) {
        this.ultimoNomeCliente = ultimoNomeCliente;
    }
    public String getUltimoNomeCliente() {
        return ultimoNomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaTerminal{" + "Olá "
        + getNomeCliente() + " "+ getUltimoNomeCliente()+
                ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia()+ " conta: "
                + getNumero()+ " e seu Saldo:"+ getSaldo() + "já está disponível para saque";

    }

}
