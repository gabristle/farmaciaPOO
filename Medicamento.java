/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Medicamento extends Produto implements Descontos{
    private String laboratorio;
    private int dosagem;
    private boolean controlado;
    
    public Medicamento(){
        laboratorio = "";
        dosagem = 0;
        controlado = false;
    }

    
    public String getLaboratorio(){
        return laboratorio;
    }
    
    public int getDosagem(){
        return dosagem;
    }

    public boolean getControlado(){
        return controlado;
    }
    
    public void setLaboratorio(String laboratorio) throws CaractereMinException, CaractereMaxException{
        if(laboratorio.length() >= 3){
            if(laboratorio.length() <= 30){
                this.laboratorio = laboratorio;
            }else{
                throw new CaractereMaxException();
            }
        }else{
            throw new CaractereMinException();
        }
    }
    
    public void setDosagem(int dosagem){
        this.dosagem = dosagem;
    }
    
    public void setControlado(boolean controlado){
        this.controlado = controlado;
    }
    
    public float descontoCliente(){
        descCliente = getPreco()-(getPreco() * 0.1f);
        return descCliente;
    }
    
    public float descontoFuncionario(){
        descFunc = getPreco()-(getPreco() * 0.2f);
        return descFunc;
    }
    
    public void impRelatorio(){
        System.out.println("\t\nRelatorio de alteracao de Medicamento: ");
        System.out.println("Estoque alterado por " +getFarmacia().getNomeFunc());
        System.out.println("Farmacia da cidade de " +getFarmacia().getCidade());
        System.out.println("\nMedicamento alterado:");
        System.out.println("Nome: " +getNome());
        System.out.println("Unidades em estoque: " +getQuantidade());
        System.out.println("Preco: " +getPreco());
        System.out.println("Preco com desconto para Clientes: " +descontoCliente());
        System.out.println("Preco com desconto para Funcionarios: " +descontoFuncionario());
        System.out.println("Laboratorio: " +getLaboratorio());
        System.out.println("Dosagem (em miligramas): " +getDosagem());
        System.out.println("Controlado: " +getControlado());
    }
}
