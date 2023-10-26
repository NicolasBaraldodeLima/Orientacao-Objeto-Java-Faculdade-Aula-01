public class testeConta {

    public static void main(String[] args) {
        Conta conta1 = new Conta(); // chamamaos a conta e colocamos um objeto conta1 nela

        conta1.conta = 1; // colocamos como valor da variávei conta, presente na classe Conta, 1
        conta1.agencia = 25; // colcoamos como valor da variável agencia, present na classe Conta, 25

        conta1.depositar(100);
        conta1.depositar(30);
        conta1.depositar(80);

        System.out.println(conta1.verificarSaldo());
    }
}
