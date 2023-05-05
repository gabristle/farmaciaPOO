/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Medicamento extends Produto implements Descontos{
    private String laboratorio;
    private int dosagem;
    private String posologia;
    
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
        System.out.println("Dosagem: " +getDosagem());
        System.out.println("Posologia: " +getPosologia());
    }
}
