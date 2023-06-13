public class Organizacao {

    public static String formula = "voltas * 20 / tempo";

    public static double calcularNota(double voltas, double tempo) {
        String expressao;
        expressao = formula.replace("voltas", Double.toString(voltas));
        expressao = expressao.replace("tempo", Double.toString(tempo));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}