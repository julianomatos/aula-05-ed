package exercicio2;

public class Teste {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario(10000, "Roberto");
        Funcionario func2 = new Funcionario(10000, "Ana");
        Funcionario func3 = new Funcionario(10000, "Xuxa");
        Funcionario func4 = new Funcionario(10000, "Joaquim");
        Funcionario func5 = new Funcionario(10000, "Bruno");

        Funcionario[] funcionarios = {func1, func2, func3, func4, func5};
        OrdenarFuncionario.ordemAlfabetica(funcionarios);

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }




    }
}
