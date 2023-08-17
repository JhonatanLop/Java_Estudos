package testes;

public class Poligono {
    int lados;
    double altura;
    double largura;

    public String indentificar(int lados) {
        String nome = "";
        if (lados == 3) {
            nome = "Triângulo";
        }
        else{
            nome = "Quadrado";
        }
        return nome;
    }

    public double calcularArea(Double altura, Double largura, int lados) {
        double area = 0.0;
        if (lados == 3) {
            area = (altura * largura) / 2;
        }
        else{
            area = largura * altura;
        }
        return area;
    }

    public static void main(String[] args) {
        Poligono poligono = new Poligono();
        
        poligono.lados = 4;
        poligono.altura = 5.0;
        poligono.largura = 12.2;

        System.out.println(poligono.indentificar(poligono.lados));
        System.out.println(poligono.calcularArea(poligono.altura, poligono.largura, poligono.lados));
    }
}
