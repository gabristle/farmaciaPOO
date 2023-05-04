/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Farmacia {
    private String cidade;
    private String rua;

    public Farmacia(){
        cidade = "";
        rua = "";
    }

    public String getCidade(){
        return cidade;
    }

    public String getRua(){
        return rua;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setRua(String rua){
        this.rua = rua;
    }
}
