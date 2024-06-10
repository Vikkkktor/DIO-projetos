package PooJava.Classes.Domain;

public class Banco {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private String nomeDoBanco;
    private int numeroDaConta;
    private String tipo;
    private String titularDaConta;
    private int saldo;
    private boolean status;

    public Banco(int numeroDaConta, String tipo, String dono) {
        this.numeroDaConta = SEQUENCIAL++;
        this.tipo = tipo;
        this.titularDaConta = dono;
    }


    public void abrirConta() {
        if (!status) {
            System.out.println("Abrindo conta...");
            this.status = true;
        }
    }

    public void depositar(int valor) {
        if (getTipo().equalsIgnoreCase("conta corrente")) {
            this.saldo = 50;
        } else if (getTipo().equalsIgnoreCase("conta poupança")) {
            this.saldo = 150;
        }
        this.saldo += valor;
        System.out.println(getSaldo());
    }

    public void sacar(int valor) {
        if (valor > this.saldo) {
            System.out.println("Não é possivel sacar mais do que o valor em conta!");
        } else {
            this.saldo -= valor;
            System.out.println(getSaldo());
        }
    }

    public void pagarMensalidade() {
        this.saldo -= 12;
        System.out.println("Sua mensalidade foi descontada, seu saldo em conta agora é: R$" + getSaldo());
    }

    public void fecharConta() {
        if (this.saldo < 0) {
            System.out.println("Você não pode fechar a conta enquanto estiver com dívidas");
        } else if (this.saldo > 0) {
            System.out.println("Você não pode fechar a conta enquanto ainda possuir saldo!");
        } else if (status) {
            System.out.println("Fechando conta...");
            status = false;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return titularDaConta;
    }

    public void setDono(String dono) {
        this.titularDaConta = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
}
