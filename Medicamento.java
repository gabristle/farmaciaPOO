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
        System.out.println("Farmacia da cidade de " +getFarmacia().getCidade());
        System.out.println("Rua: " +getFarmacia().getRua());
        System.out.println("\nMedicamento alterado:");
        System.out.println("Nome: " +getNome());
        System.out.println("Unidades em estoque: " +getQuantidade());
        System.out.println("Preco: " +getPreco());
        System.out.println("Laboratorio: " +getLaboratorio());
        System.out.println("Dosagem: " +getDosagem());
        System.out.println("Posologia: " +getPosologia());
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
