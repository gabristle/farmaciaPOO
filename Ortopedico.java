/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Ortopedico extends Produto{
    private String tipo;
    private String tamanho;
    private String marca;

    public void impRelatorio(){
        System.out.println("\t\nRelatorio de alteracao de Ortopedico: ");
        System.out.println("Farmacia da cidade de " +getFarmacia().getCidade());
        System.out.println("Rua: " +getFarmacia().getRua());
        System.out.println("\nOrtopedico alterado:");
        System.out.println("Nome: " +getNome());
        System.out.println("Unidades em estoque: " +getQuantidade());
        System.out.println("Preco: " +getPreco());
        System.out.println("Marca: " +getMarca());
        System.out.println("Tamanho: " +getTamanho());
        System.out.println("Tipo: " +getTipo());
    }

    public Ortopedico(){
        tipo = "";
        tamanho = "";
        marca = "";
    }

    public String getTipo(){
        return tipo;
    }

    public String getTamanho(){
        return tamanho;
    }

    public String getMarca(){
        return marca;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
}
