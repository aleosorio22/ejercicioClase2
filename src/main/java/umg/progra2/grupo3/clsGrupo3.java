package umg.progra2.grupo3;

public class clsGrupo3 {
    // Método para calcular el volumen de un prisma rectangular
    public double volumenPrismaRectangular(double areaBase, double altura) {
        return areaBase * altura;
    }

    // Método para calcular el área de un paralelogramo
    public double areaParalelogramo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular el volumen de un cilindro
    public double volumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
