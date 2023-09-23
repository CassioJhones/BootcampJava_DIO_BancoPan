public class quadrilatero { //--CLASEE PUBLICA QUADRILATERO

    public static double area(double lado) {
         //--METODO QUE CALCULA AREA DO QUADRADO
         return lado * lado;
    }

    public static double area(double lado1, double lado2) {
        //METODO QUE CALCULA AREADO RETANGULO
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        //--METODO QUE CALCULA AREA DO TRAPEZIO
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static float area(float diagonal1, float diagonal2) {
        //--METODO QUE CALCULA AREA DO LOSANGO
        return (diagonal1 * diagonal2) / 2;
    }
    
}
