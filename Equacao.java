import java.util.Scanner;

public class Equacao {
    
    private double a, b, c, x1, x2, delta;
    
    public double calcularDelta() {
        return delta = Math.pow(b,2) - 4 * a * c;
    }
    
    public double calcularX1() {
        return x1 = (-b + Math.sqrt(delta)) / (2*a);
        
    }
    
    public double calcularX2() {
        return x2 = (-b - Math.sqrt(delta)) / (2*a);
        
    }
    
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    

    public static void main(String[] args) {
      
      Equacao equacao = new Equacao();
      
      double a, b, c;
      
      Scanner leia = new Scanner(System.in);
      
      System.out.println("Digite o valor de A:");
      a = leia.nextDouble();
      
      while(a == 0) {
          System.out.println("O programa é pra calcular equações de segundo grau!");
          a = leia.nextDouble();
      }
      
      equacao.setA(a);
      
      System.out.println("Digite o valor de B:");
      b = leia.nextDouble();
      
      equacao.setB(b);
     
      System.out.println("Digite o valor de C:");
      c = leia.nextDouble();
      
      equacao.setC(c);
      
      if(equacao.calcularDelta() > 0) {

      System.out.println("Valor de delta: " + equacao.calcularDelta());
      System.out.println("Valor de x1: " + equacao.calcularX1());
      System.out.println("Valor de x2: " + equacao.calcularX2()); 
          
      }
      
      else if(equacao.calcularDelta() == 0) {
      System.out.println("Valor de delta: " + equacao.calcularDelta());
      System.out.println("Valor de x1: " + equacao.calcularX1());
      
      }
      
      else {
      System.out.println("Valor de delta: " + equacao.calcularDelta());
      System.out.println("Não existem raízes reais.");
          
      }
      
      leia.close();
      
    }
}
