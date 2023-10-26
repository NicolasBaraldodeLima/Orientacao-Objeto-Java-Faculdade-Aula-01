public class Conta {

    int agencia;
    int conta;
    float saldo = 0;

    public void depositar (float valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public float verificarSaldo() {
        return saldo;
    }

}
