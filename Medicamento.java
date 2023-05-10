/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Medicamento extends Produto implements Descontos{
    private String laboratorio;
    private float dosagem;
    
    public Medicamento(){
        laboratorio = "";
        dosagem = 0;
    }
    
    public String getLaboratorio(){
        return laboratorio;
    }
    
    public float getDosagem(){
        return dosagem;
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
    
    public void setDosagem(float dosagem) throws NumNegativoException, QuantidadeMaxException{
        if(dosagem > 0){
            if(dosagem <=1000){
            this.dosagem = dosagem;
            }else{
                throw new QuantidadeMaxException();
            }
        }else{
            throw new NumNegativoException();
        }
    }
    
    public float descontoCliente(){
        setDescCliente(getPreco()-(getPreco() * 0.1f));
        return getDescCliente();
    }
    
    public float descontoFuncionario(){
        setDescFunc(getPreco()-(getPreco() * 0.2f));
        return getDescFunc();
    }
    
    public void impRelatorio(){
        System.out.println("\t\nRelatorio de alteracao de Medicamento: ");
        System.out.println("Estoque alterado por " +getFarmacia().getNomeFunc());
        System.out.println("Farmacia da cidade de " +getFarmacia().getCidade());
        System.out.println("Medicamento alterado:");
        System.out.println("Nome: " +getNome());
        System.out.println("Unidades em estoque: " +getQuantidade());
        System.out.println("Preco: " +getPreco());
        System.out.println("Preco com desconto para Clientes: " +descontoCliente());
        System.out.println("Preco com desconto para Funcionarios: " +descontoFuncionario());
        System.out.println("Laboratorio: " +getLaboratorio());
        System.out.println("Dosagem (em miligramas): " +getDosagem());
    }
}
