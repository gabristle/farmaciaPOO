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
        int opcao1 = 0;
        String cidade = "";
        String nomeFunc = "";

        
        System.out.println("========== Cadastro de Estoque ==========");
        nomeFunc = (l.entDados("\nDigite seu nome: "));
        System.out.println("\nEscolha a farmacia: ");
        System.out.println("1 - Apucarana");
        System.out.println("2 - Londrina ");
        System.out.println("3 - Ibaiti");
        opcao1 = Integer.parseInt(l.entDados("\nEscolha a opcao: "));
        switch(opcao1){
            case 1:
            cidade = "Apucarana";
            break;

            case 2:
            cidade = "Londrina";
            break;

            case 3:
            cidade = "Ibaiti";
            break;
            default:
            System.out.println("Opcao Invalida");
            break;
        }

        while(vai){
            System.out.println("========== Cadastro de Estoque ==========");
            System.out.println("\nEscolha o tipo de produto: ");
            System.out.println("1 - Medicamento");
            System.out.println("2 - Ortopedico");
            System.out.println("3 - Doce");
            opcao = Integer.parseInt(l.entDados("\nEscolha a opcao: "));
            
            switch(opcao){
                case 1:
                System.out.println("\nDigite os dados do estoque: ");
                medic.getFarmacia().setNomeFunc(nomeFunc);
                medic.getFarmacia().setCidade(cidade);
                medic.setNome(l.entDados("\nNome do medicamento: "));
                medic.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                medic.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                medic.setLaboratorio(l.entDados("Nome do laboratorio: "));
                medic.setDosagem(Integer.parseInt(l.entDados("Dosagem (em miligramas):")));
                medic.setPosologia(l.entDados("Posologia: "));

                medic.impRelatorio();
                break;

                case 2:
                System.out.println("Digite os dados do estoque: ");
                orto.getFarmacia().setNomeFunc(nomeFunc);
                medic.getFarmacia().setCidade(cidade);
                orto.setNome(l.entDados("Nome do produto: "));
                orto.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                orto.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                orto.setMarca(l.entDados("Marca do produto: "));
                orto.setTamanho(l.entDados("Tamanho: "));
                orto.setTipo(l.entDados("Tipo de ortopedico: "));

                orto.impRelatorio();
                break;

                case 3:
                System.out.println("Digite os dados do estoque: ");
                doce.getFarmacia().setNomeFunc(nomeFunc);
                medic.getFarmacia().setCidade(cidade);
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
