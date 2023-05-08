/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Doce extends Produto{
    private String tipo;
    private String sabor;
    private int pesoLiq;
    private String marca;

    public void impRelatorio(){
        System.out.println("\t\nRelatorio de alteracao de Doce: ");
        System.out.println("Estoque alterado por " +getFarmacia().getNomeFunc());
        System.out.println("Farmacia da cidade de " +getFarmacia().getCidade());
        System.out.println("\nDoce alterado:");
        System.out.println("Nome: " +getNome());
        System.out.println("Unidades em estoque: " +getQuantidade());
        System.out.println("Preco: " +getPreco());
        System.out.println("Tipo: " +getTipo());
        System.out.println("Tamanho: " +getSabor());
        System.out.println("Peso Liquido (em gramas): " +getPesoLiq());
        System.out.println("Marca: " +getMarca());
    }

    public Doce(){
        tipo = "";
        sabor = "";
        pesoLiq = 0;
        marca = "";
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public void setPesoLiq(int pesoLiq){
        this.pesoLiq = pesoLiq;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getTipo(){
        return tipo;
    }
    
    public String getSabor(){
        return sabor;
    }

    public int getPesoLiq(){
        return pesoLiq;
    }

    public String getMarca(){
        return marca;
    }

    public void switchTipo(int tipo){
        switch(tipo){
            
        }
    }
    
}
