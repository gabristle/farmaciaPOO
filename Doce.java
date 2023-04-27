public class Doce extends Produto{
    private String tipo;
    private String sabor;
    private int pesoLiq;
    private String marca;

    public void impRelatorio(){
        System.out.println("\t\nRelatorio de alteracao de Doce: ");
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
    
}
