package company.com;

public class PessoaFisica extends Contribuintes implements CalculaImposto {
    private int CPF;

    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Renda Bruta: " + getRendaBruta());
        System.out.println("CPF: " + getCPF());
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    @Override
    public void calculo() {
        double imposto;
        if (getRendaBruta() < 2000) {
            imposto = getRendaBruta() * 0.2;
            System.out.println("Imposto calculado: " + imposto);
        } else {
            imposto = getRendaBruta() * 0.1;
            System.out.println("Imposto calculado: " + imposto);
        }
    }
}
