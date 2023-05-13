
package heranca;


public class Chuveiro extends Eletrodomesticos{
    private int potencia;

    public Chuveiro(int numeroSerie, int peso, String marca, String nome, int potencia) {
        super(numeroSerie, peso, marca, nome);
        this.potencia=potencia;
    }
    
    public String toString(){
        return "\n ***CHUVEIRO***" +
               "\n Nome: " + getNome() +
               "\n Marca: " + getMarca() +
               "\n Numero de Serie: " + getNumeroSerie()+
               "\n Peso: " + getPeso() + "kg" + 
               "\n Potencia: " + getPotencia()+ "W";
    }
    
    

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
