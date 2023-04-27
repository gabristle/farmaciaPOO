/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public abstract class Produto {
    private String nome;
    private int quantidade;
    private float preco;
    private Farmacia farmacia;

    public abstract void impRelatorio();

    public Produto(){
        nome = "";
        quantidade = 0;
        preco = 0;
        farmacia = new Farmacia();
    }

    public Farmacia getFarmacia(){
        return farmacia;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public float getPreco(){
        return preco;
    }

    public void setFarmacia(Farmacia farmacia){
        this.farmacia = farmacia;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }
}
