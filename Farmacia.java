/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Farmacia {
    private String cidade;
    private String nomeFunc;

    public Farmacia(){
        cidade = "";
        nomeFunc = "";
    }

    public String getCidade(){
        return cidade;
    }

    public String getNomeFunc(){
        return nomeFunc;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setNomeFunc(String nomeFunc){
        this.nomeFunc = nomeFunc;
    }

}
