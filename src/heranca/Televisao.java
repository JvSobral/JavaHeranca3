
package heranca;

public class Televisao extends Eletrodomesticos {
    private int polegadas;
    private String tipo;

    public Televisao(int numeroSerie, int peso, String marca, String nome, int polegadas, String tipo) {
        super(numeroSerie, peso, marca, nome);
        this.polegadas=polegadas;
        this.tipo=tipo;
    }
    
        public String toString(){
        return "\n ***TELEVISÃO***" +
               "\n Nome: " + getNome() +
               "\n Marca: " + getMarca() +
               "\n Numero de Serie: " + getNumeroSerie()+
               "\n Peso: " + getPeso() + "kg" +
               "\n Polegadas: " + getPolegadas() +
               "\n Tipo: " + getTipo()  ;
        
    }
    
    

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
