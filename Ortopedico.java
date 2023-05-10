/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Ortopedico extends Produto implements Descontos{
    private String tipo;
    private String tamanho;
    
    public Ortopedico(){
        tipo = "";
        tamanho = "";
    }

    public String getTipo(){
        return tipo;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public float descontoCliente(){
        setDescCliente(getPreco()-(getPreco() * 0.1f));
        return getDescCliente();
    }

    public float descontoFuncionario(){
        setDescFunc(getPreco()-(getPreco() * 0.15f));
        return getDescFunc();
    }

    //metodo sobrecarregado
    public void switchOrto(int tipo){
        switch(tipo){
            case 1:
            this.tipo = "Joelheira";
            break;

            case 2:
            this.tipo = "Tala";
            break;

            case 3:
            this.tipo = "Tornozeleira";
            break;

            case 4:
            this.tipo = "Cinta";
            break;

            case 5:
            this.tipo = "Espaldeira";
            break;

            default:
            System.out.println("Opcao Invalida");
            break;
        }
    }

    //metodo sobrecarregado
    public void switchOrto(char tamanho){
        switch(tamanho){
            case 'M' :
            setTamanho("Medio");
            break;

            case 'P' :
            setTamanho("Pequeno");
            break;

            case 'G' :
            setTamanho("Grande");
            break;

            case 'm' :
            setTamanho("Medio");
            break;

            case 'p' :
            setTamanho("Pequeno");
            break;

            case 'g' :
            setTamanho("Grande");
            break;

            default:
            System.out.println("Opcao Invalida");
            break;
        }
    }

    public void impRelatorio(){
        System.out.println("\t\nRelatorio de alteracao de Ortopedico: ");
        System.out.println("Estoque alterado por " +getFarmacia().getNomeFunc());
        System.out.println("Farmacia da cidade de " +getFarmacia().getCidade());
        System.out.println("\nOrtopedico alterado:");
        System.out.println("Nome: " +getNome());
        System.out.println("Unidades em estoque: " +getQuantidade());
        System.out.println("Preco: " +getPreco());
        System.out.println("Preco com desconto para Clientes: " +descontoCliente());
        System.out.println("Preco com desconto para Funcionarios: " +descontoFuncionario());
        System.out.println("Tamanho: " +getTamanho());
        System.out.println("Tipo: " +getTipo());
    }
}
