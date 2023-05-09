/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public abstract class Produto {
    private String nome;
    private int quantidade;
    private float preco;
    private Farmacia farmacia;
    protected float descCliente;
    protected float descFunc;

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

    public void setNome(String nome) throws CaractereMinException, CaractereMaxException{
        if(nome.length() >= 3){
            if(nome.length() <= 30){
                this.nome = nome;
            }else{
                throw new CaractereMaxException();
            }
        }else{
            throw new CaractereMinException();
        }
    }

    public void setQuantidade(int quantidade) throws NumNegativoException, QuantidadeMaxException{
        if(quantidade > 0){
            if(quantidade <= 1000){
                this.quantidade = quantidade;
            }else{
                throw new QuantidadeMaxException();
            }
        }else{
            throw new NumNegativoException();
        }

    }

    public void setPreco(float preco) throws NumNegativoException{
        if(preco > 0){
            this.preco = preco;
        } else {
            throw new NumNegativoException();
        }
    }
}
