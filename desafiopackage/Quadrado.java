package desafiopackage;

public class Quadrado implements FormaGeometrica {
  
  String nome = "Quadrado";
  double lado;

  public Quadrado(double Lado) {
    this.lado = Lado;
  }

  @Override
  public String getNomeForma() {
    // TODO Auto-generated method stub

    return nome;
  }

  @Override
  public double calculaArea() {
    // TODO Auto-generated method stub
    return lado*lado;
  }

}
