package company.com;

public class Main {

    public static void main(String[] args) {
        // instância pessoa física
        PessoaFisica p1 = new PessoaFisica();
        // inserindo valores
        p1.setCPF(87981164);
        p1.setIdade(75);
        p1.setNome("Maria");
        p1.setRendaBruta(3000);
        // exibindo as informações da pessoa e o imposto da mesma a ser pagado
        p1.status();
        p1.calculo();

        System.out.println("");

        // instância pessoa jurídica
        PessoaJuri j1 = new PessoaJuri();
        // inserindo valores
        j1.setIdade(55);
        j1.setNome("João");
        j1.setRendaBruta(7500);
        j1.setCNPJ(2851725);
        // exibindo as informações da pessoa e o imposto da mesma a ser pagado
        j1.status();
        j1.calculo();
    }
}
