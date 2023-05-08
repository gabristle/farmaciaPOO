/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Doce extends Produto{
    private String tipo;
    private String sabor;

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
    }

    public Doce(){
        tipo = "";
        sabor = "";
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public String getTipo(){
        return tipo;
    }
    
    public String getSabor(){
        return sabor;
    }

    public void switchTipo(int tipo){
        switch(tipo){
            case 1:
            setTipo("Bala");
            break;

            case 2:
            setTipo("Chocolate");
            break;

            case 3:
            setTipo("Chiclete");
            break;

            case 4:
            setTipo("Pirulito");
            break;

            default:
            System.out.println("Opcao invalida! Digite novamente (de 1 a 4): ");
            break;
        }
    }
    
}
