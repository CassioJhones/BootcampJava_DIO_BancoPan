public class main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("\n--- Calculadora ---");
        calculadora.soma(3, 6);
        calculadora.subtracao(9, 8);
        calculadora.multiplicacao(7, 8);
        calculadora.divisao(5, 23);

        // Empréstimo
        System.out.println("\n--- Empréstimo ---");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        // Mensagem
        System.out.println("\n---Mensagem Horario---");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
    }}
