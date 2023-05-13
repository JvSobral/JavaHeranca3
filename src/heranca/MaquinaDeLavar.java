
package heranca;

public class MaquinaDeLavar extends Eletrodomesticos  {
    private String tipo;
    private String cor;
    private double capacidade;

    public MaquinaDeLavar(int numeroSerie, int peso, String marca, String nome, String tipo, String cor, double capacidade) {
        super(numeroSerie, peso, marca, nome);
        this.tipo=tipo;
        this.cor=cor;
        this.capacidade=capacidade;
    }
        public String toString(){
        return "\n ***MAQUINA DE LAVAR***" +
               "\n Nome: " + getNome() +
               "\n Marca: " + getMarca() +
               "\n Numero de Serie: " + getNumeroSerie()+
               "\n Peso: " + getPeso() + "kg" +
               "\n Tipo: " + getTipo() +
               "\n Cor: " + getCor() +
               "\n Capacidade: " + getCapacidade() + "kg";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
            
    
}
