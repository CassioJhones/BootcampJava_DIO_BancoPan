public class main {
    public static void main(String[] args) throws Exception {
       System.out.println("\n---CALCULO DE ÁREA---\n");

       double areaQuadrado = quadrilatero.area(5) ;
       System.out.println("-Area do quadrado: " + areaQuadrado);

       double areaRetangulo = quadrilatero.area(2d,3d);
       System.out.println("-Area do Retangulo: " + areaRetangulo);

       double areaTrapezio = quadrilatero.area(2, 3, 4) ;
       System.out.println("-Area do Trapezio: " + areaTrapezio);

       double areaLosango = quadrilatero.area(3f, 4f);
       System.out.println("-Area do Losango: " + areaLosango + "\n");

    }
}
