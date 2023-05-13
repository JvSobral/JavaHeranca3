
package heranca;


public class Industrial extends Fogao {
    private double profundidade;

    public Industrial(int numeroSerie, int peso, String marca, String nome, int qtdBocas, Double largura, Double profundidade) {
        super(numeroSerie, peso, marca, nome, qtdBocas, largura);
        this.profundidade=profundidade;
        
    }
    
     public String toString(){
        return "\n ***FOGAO INDUSTRIAL***" +
               "\n Nome: " + getNome() +
               "\n Marca: " + getMarca() +
               "\n Numero de Serie: " + getNumeroSerie()+
               "\n Peso: " + getPeso() + "kg" +
               "\n Profundidade: " + getProfundidade() + "m" ;
    }
    
    
    

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
    
    
}
