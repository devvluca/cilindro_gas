package FeitoPorALdo;

public class CilindroGas {
    private int idCilindro;
    private float capacidadeMaxima;
    private float capacidadeAtual;
    private float qtdeUltimoConsumo;



    public CilindroGas(int idCilindro, float capacidadeMaxima) {
        super();
        this.idCilindro = idCilindro;
        this.capacidadeMaxima = capacidadeMaxima;
        this.capacidadeAtual = capacidadeMaxima;
    }


    public float getCapacidadeMaxima() {
        return capacidadeMaxima;
    }


    public void setCapacidadeMaxima(float capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }


    public int getIdCilindro() {
        return idCilindro;
    }


    public float getCapacidadeAtual() {
        return capacidadeAtual;
    }


    public float getQtdeUltimoConsumo() {
        return qtdeUltimoConsumo;
    }


    public boolean registrarConsumo(float qtde) {
        if (qtde <= this.capacidadeAtual ) {
            this.qtdeUltimoConsumo = qtde;
            this.capacidadeAtual -= qtde;
            return true;
        }
        return false;
    }
}
