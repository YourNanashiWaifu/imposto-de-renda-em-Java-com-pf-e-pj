package company.com;

public class PessoaJuri extends Contribuintes implements CalculaImposto {
    private int CNPJ;

    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Renda Bruta: " + getRendaBruta());
        System.out.println("CNPJ: " + getCNPJ());
    }


    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public void calculo() {
        double imposto;
        imposto = getRendaBruta() * 0.1;
        System.out.println(imposto);
    }
}
