public class Teste {
    public static void main(String[] args) {

        String texte = "João";
        // sout é o snippet para abrir automticamente o System.out.printIn

        System.out.println(texte.charAt(0)); // vai pegar o primeiro caractere da palavra armazenada. o método charAt só pede até 4 caracteres
        System.out.println(texte.substring(1,3)); // vai pegar do primeiro ao terceiro caractere

        double media = 2.9;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if(media < 7 && media >= 3) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // operador ternário (?)

        System.out.println((media >= 7) ? "Aprovado":"Reprovado");

        // switch case

        int numero1 = 10;

        switch (numero1) {

            case 8:
                System.out.println("O número é 8");
                break;
            case 9:
                System.out.println("O número é 9");
                break;
            case 10:
                System.out.println("O número é 10");
                break;
            default:
                System.out.println("Nenhum resultado vádlido");
        }

          // loop while

         int cont = 0;

        while (cont < 10) {
            System.out.println(cont);
            cont++;
        }

        // loop do while

        int contDois = 10;

        do {
            System.out.println(contDois);
        } while (contDois < 10); // do while sempre vai imprimir pelo menos um


        // loop for

        for (int contTres = 0; contTres < 10; contTres++) {
            System.out.println(contTres);
        }

        // vetor para iterar itens com for int

        int[] valores = {1,2,3,4,5};

        for (int valor: valores) {
            System.out.println(valor);
        }

    }
}
