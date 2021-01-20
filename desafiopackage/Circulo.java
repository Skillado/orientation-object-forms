package desafiopackage;

public class Circulo implements FormaGeometrica {
  
  String nome  = "circulo";
  double raio;

  Circulo(double raio) {
    this.raio = raio; 
  }

  @Override
  public double calculaArea() {
    // TODO Auto-generated method stub
    double cincunferencia = 3.14 * raio * raio;
    return cincunferencia;
  }

  @Override
  public String getNomeForma() {
    // TODO Auto-generated method stub
    return nome;
  }


}
