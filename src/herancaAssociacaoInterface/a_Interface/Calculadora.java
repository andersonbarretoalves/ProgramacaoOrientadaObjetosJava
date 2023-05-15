package herancaAssociacaoInterface.a_Interface;

class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(double operado1, double operado2) {
        System.out.println("Soma: " + operado1 + operado2);
    }

    @Override
    public void subtracao(double operado1, double operado2) {
        System.out.println("Subtração: " + (operado1 - operado2));
    }

    @Override
    public void multiplicacao(double operado1, double operado2) {
        System.out.println("Multiplicação: " + operado1 * operado2);
    }

    @Override
    public void divisao(double operado1, double operado2) {
        System.out.println("Divisão: " + operado1 / operado2);
    }

}
