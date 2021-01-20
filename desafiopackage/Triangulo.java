package desafiopackage;

public class Triangulo implements FormaGeometrica {

  String nome = "Triangulo";
  double base, altura;  

  Triangulo( double base, double altura) {

    this.base = base;
    this.altura = altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }


  public void setBase(double base) {
    this.base = base;
  }


  @Override
  public double calculaArea() {
    // TODO Auto-generated method stub
    return base * altura;
  }

  @Override
  public String getNomeForma() {
    // TODO Auto-generated method stub
    return null;
  }

}
