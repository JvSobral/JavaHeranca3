
package heranca;

public class Microondas extends Eletrodomesticos {
    private double qtdLitros;

    public Microondas(int numeroSerie, int peso, String marca, String nome, double qtdLitros) {
        super(numeroSerie, peso, marca, nome);
        this.qtdLitros=qtdLitros;
        
    }

    
        public String toString(){
        return "\n ***MICROONDAS***" +
               "\n Nome: " + getNome() +
               "\n Marca: " + getMarca() +
               "\n Numero de Serie: " + getNumeroSerie()+
               "\n Peso: " + getPeso() + "kg" +
               "\n Capacidade: " + getQtdLitros()+ " Litros";
    }

    public double getQtdLitros() {
        return qtdLitros;
    }

    public void setQtdLitros(double qtdLitros) {
        this.qtdLitros = qtdLitros;
    }
    
    
}
