/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Medicamento extends Produto{
    private String laboratorio;
    private int dosagem;
    private String posologia;

    public void impRelatorio(){
        System.out.println("\t\nRelatorio de alteracao de Medicamento: ");
    }

    public Medicamento(){
        laboratorio = "";
        dosagem = 0;
        posologia = "";
    }

    public String getLaboratorio(){
        return laboratorio;
    }

    public int getDosagem(){
        return dosagem;
    }

    public String getPosologia(){
        return posologia;
    }

    public void setLaboratorio(String laboratorio){
        this.laboratorio = laboratorio;
    }

    public void setDosagem(int dosagem){
        this.dosagem = dosagem;
    }

    public void setPosologia(String posologia){
        this.posologia = posologia;
    }
}
