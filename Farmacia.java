/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Farmacia {
    private String cidade;
    private String rua;
    private int telefone;
    

    public Farmacia(){
        cidade = "";
        rua = "";
        telefone = 0;
    }

    public String getCidade(){
        return cidade;
    }

    public int getTelefone(){
        return telefone;
    }

    public String getRua(){
        return rua;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public void setRua(String rua){
        this.rua = rua;
    }
}
