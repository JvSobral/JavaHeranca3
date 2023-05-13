
package heranca;


public class Domestico extends Fogao {
    private String tipo;

    public Domestico(int numeroSerie, int peso, String marca, String nome, int qtdBocas, Double largura, String tipo) {
        super(numeroSerie, peso, marca, nome, qtdBocas, largura);
        this.tipo=tipo;
    }
    
     public String toString(){
        return "\n ***FOGÃO DOMESTICO***" +
               "\n Nome: " + getNome() +
               "\n Marca: " + getMarca() +
               "\n Numero de Serie: " + getNumeroSerie()+
               "\n Peso: " + getPeso() + "kg" +
               "\n Numero de Bocas: " + getQtdBocas() + 
               "\n Largura: " + getLargura() + "m" +
               "\n Tipo: " + getTipo();
    }
    
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
