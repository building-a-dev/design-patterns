import java.util.ArrayList;
import java.util.List;

public class Canvas {
    static List<FiguraGeometrica> figuras;

    public static void main(final String[] args) {
        figuras = new ArrayList<>();
        figuras.add(new Circulo(3.0));
        figuras.add(new Quadrado(3.0));
        // seria possível incluir trapézio, triangulo, hexágono, etc
        figuras.stream()
                .forEach(figura -> System.out.println(figura.calcularArea()));
        // mostra o resultado (cálculo de área) sem se preocupar
        // com a fórmula específica de cada figura
    }
}

interface FiguraGeometrica {
    double calcularArea();
}

class Quadrado implements FiguraGeometrica {
    double l;

    Quadrado(final double l) {
        this.l = l;
    }

    @Override
    public double calcularArea() {
        return Math.pow(l, 2);
    }
}

class Circulo implements FiguraGeometrica {
    double r;

    Circulo(final double r) {
        this.r = r;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(r, 2);
    }
}

