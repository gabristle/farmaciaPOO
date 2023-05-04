/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

public class Principal {
    
    public static void main(String arg[]){ 
        Medicamento medic = new Medicamento();
        Ortopedico orto = new Ortopedico();
        Doce doce = new Doce();
        Leitura l = new Leitura();
        int opcao = 0;
        boolean vai = true;
        
        while(vai){

            System.out.println("========== Cadastro de Estoque ==========");
            System.out.println("\nEscolha o tipo de produto: ");
            System.out.println("1 - Medicamento");
            System.out.println("2 - Ortopedico");
            System.out.println("3 - Doce");
            opcao = Integer.parseInt(l.entDados("\nEscolha a opcao: "));
            
            switch(opcao){
                case 1:
                System.out.println("\nPreencha os dados da Farmacia que quer gerenciar:");
                medic.getFarmacia().setCidade(l.entDados("Digite a cidade da Farmacia: "));
                medic.getFarmacia().setRua(l.entDados("Rua: "));
                System.out.println("\nDigite os dados do estoque: ");
                medic.setNome(l.entDados("\nNome do medicamento: "));
                medic.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                medic.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                medic.setLaboratorio(l.entDados("Nome do laboratorio: "));
                medic.setDosagem(Integer.parseInt(l.entDados("Dosagem (em miligramas):")));
                medic.setPosologia(l.entDados("Posologia: "));

                medic.impRelatorio();
                break;

                case 2:
                System.out.println("\nPreencha os dados da Farmacia que quer gerenciar:");
                orto.getFarmacia().setCidade(l.entDados("\nDigite a cidade da Farmacia: "));
                orto.getFarmacia().setRua(l.entDados("Rua: "));
                System.out.println("Digite os dados do estoque: ");
                orto.setNome(l.entDados("Nome do produto: "));
                orto.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                orto.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                orto.setMarca(l.entDados("Marca do produto: "));
                orto.setTamanho(l.entDados("Tamanho: "));
                orto.setTipo(l.entDados("Tipo de ortopedico: "));

                orto.impRelatorio();
                break;

                case 3:
                System.out.println("\nPreencha os dados da Farmacia que quer gerenciar:");
                doce.getFarmacia().setCidade(l.entDados("Digite a cidade da Farmacia: "));
                doce.getFarmacia().setRua(l.entDados("Rua: "));
                System.out.println("Digite os dados do estoque: ");
                doce.setNome(l.entDados("Nome do produto: "));
                doce.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                doce.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                doce.setTipo(l.entDados("Tipo: "));
                doce.setSabor(l.entDados("Sabor: "));
                doce.setPesoLiq(Integer.parseInt(l.entDados("Peso Liquido: ")));
                doce.setMarca(l.entDados("Marca do produto: "));

                doce.impRelatorio();
                break;

                default:
                System.out.println("Opcao invalida");
                break;
            }
        }
    }

}
