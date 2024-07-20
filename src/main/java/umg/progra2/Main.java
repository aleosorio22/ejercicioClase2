package umg.progra2;

import umg.progra2.grupo1.clsGrupo1;
import umg.progra2.grupo2.clsGrupo2;
import umg.progra2.grupo3.clsGrupo3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        clsGrupo1 ejercicios = new clsGrupo1();
        clsGrupo2 ejercicios2 = new clsGrupo2();
        clsGrupo3 ejercicio3 = new clsGrupo3();


        // grupo 1
        System.out.println("Ingrese el radio del círculo:");
        double radio = sc.nextDouble();

        System.out.println("Ingrese el lado del cubo:");
        double lado = sc.nextDouble();

        double areaCirculo = ejercicios.areaCirculo(radio);
        double circunferencia = ejercicios.circunferenciaCirculo(radio);
        double volumenCubo = ejercicios.volumenCubo(lado);

        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Circunferencia del círculo: " + circunferencia);
        System.out.println("Volumen del cubo: " + volumenCubo);

        // Solicitar datos para los ejercicios del grupo 2
        System.out.println("Ingrese la base de la pirámide cuadrada:");
        double basePiramide = sc.nextDouble();

        System.out.println("Ingrese la altura de la pirámide cuadrada:");
        double alturaPiramide = sc.nextDouble();

        System.out.println("Ingrese la base del triángulo:");
        double baseTriangulo = sc.nextDouble();

        System.out.println("Ingrese la altura del triángulo:");
        double alturaTriangulo = sc.nextDouble();

        double areaPiramide = ejercicios2.areaPiramideCuadrada(basePiramide, alturaPiramide);
        double volumenPiramide = ejercicios2.volumenPiramideCuadrada(basePiramide, alturaPiramide);
        double areaTriangulo = ejercicios2.areaTriangulo(baseTriangulo, alturaTriangulo);

        System.out.println("Área de la pirámide cuadrada: " + areaPiramide);
        System.out.println("Volumen de la pirámide cuadrada: " + volumenPiramide);
        System.out.println("Área del triángulo: " + areaTriangulo);

        // Solicitar datos para los ejercicios del grupo 3
        System.out.println("Ingrese el área de la base del prisma rectangular:");
        double areaBasePrisma = sc.nextDouble();

        System.out.println("Ingrese la altura del prisma rectangular:");
        double alturaPrisma = sc.nextDouble();

        System.out.println("Ingrese la base del paralelogramo:");
        double baseParalelogramo = sc.nextDouble();

        System.out.println("Ingrese la altura del paralelogramo:");
        double alturaParalelogramo = sc.nextDouble();

        System.out.println("Ingrese el radio de la base del cilindro:");
        double radioCilindro = sc.nextDouble();

        System.out.println("Ingrese la altura del cilindro:");
        double alturaCilindro = sc.nextDouble();

        double volumenPrisma = ejercicio3.volumenPrismaRectangular(areaBasePrisma, alturaPrisma);
        double areaParalelogramo = ejercicio3.areaParalelogramo(baseParalelogramo, alturaParalelogramo);
        double volumenCilindro = ejercicio3.volumenCilindro(radioCilindro, alturaCilindro);

        System.out.println("Volumen del prisma rectangular: " + volumenPrisma);
        System.out.println("Area del paralelogramo" + areaParalelogramo);
        System.out.println("Volumen del cilindro: " + volumenCilindro);
    }
}