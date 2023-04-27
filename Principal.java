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
                medic.getFarmacia().setTelefone(Integer.parseInt(l.entDados("Telefone: ")));

                System.out.println("\nDigite os dados do estoque: ");
                medic.setNome(l.entDados("\nNome do medicamento: "));
                medic.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                medic.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                medic.setLaboratorio(l.entDados("Nome do laboratorio: "));
                medic.setDosagem(Integer.parseInt(l.entDados("Dosagem (em miligramas):")));
                medic.setPosologia(l.entDados("Posologia: "));

                medic.impRelatorio();
                System.out.println("Farmacia da cidade de " +medic.getFarmacia().getCidade());
                System.out.println("Rua: " +medic.getFarmacia().getRua());
                System.out.println("Telefone: " +medic.getFarmacia().getTelefone());
                System.out.println("\nMedicamento alterado:");
                System.out.println("Nome: " +medic.getNome());
                System.out.println("Unidades em estoque: " +medic.getQuantidade());
                System.out.println("Preco: " +medic.getPreco());
                System.out.println("Laboratorio: " +medic.getLaboratorio());
                System.out.println("Dosagem: " +medic.getDosagem());
                System.out.println("Posologia: " +medic.getPosologia());
                break;

                case 2:
                System.out.println("\nPreencha os dados da Farmacia que quer gerenciar:");
                orto.getFarmacia().setCidade(l.entDados("\nDigite a cidade da Farmacia: "));
                orto.getFarmacia().setRua(l.entDados("Rua: "));
                orto.getFarmacia().setTelefone(Integer.parseInt(l.entDados("Telefone: ")));

                System.out.println("Digite os dados do estoque: ");
                orto.setNome(l.entDados("Nome do produto: "));
                orto.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                orto.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                orto.setMarca(l.entDados("Marca do produto: "));
                orto.setTamanho(l.entDados("Tamanho: "));
                orto.setTipo(l.entDados("Tipo de ortopedico: "));

                orto.impRelatorio();
                System.out.println("Farmacia da cidade de " +orto.getFarmacia().getCidade());
                System.out.println("Rua: " +orto.getFarmacia().getRua());
                System.out.println("Telefone: " +orto.getFarmacia().getTelefone());
                System.out.println("\nOrtopedico alterado:");
                System.out.println("Nome: " +orto.getNome());
                System.out.println("Unidades em estoque: " +orto.getQuantidade());
                System.out.println("Preco: " +orto.getPreco());
                System.out.println("Marca: " +orto.getMarca());
                System.out.println("Tamanho: " +orto.getTamanho());
                System.out.println("Tipo: " +orto.getTipo());
                break;

                case 3:
                System.out.println("\nPreencha os dados da Farmacia que quer gerenciar:");
                doce.getFarmacia().setCidade(l.entDados("Digite a cidade da Farmacia: "));
                doce.getFarmacia().setRua(l.entDados("Rua: "));
                doce.getFarmacia().setTelefone(Integer.parseInt(l.entDados("Telefone: ")));

                System.out.println("Digite os dados do estoque: ");
                doce.setNome(l.entDados("Nome do produto: "));
                doce.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                doce.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                doce.setTipo(l.entDados("Tipo: "));
                doce.setSabor(l.entDados("Sabor: "));
                doce.setPesoLiq(Integer.parseInt(l.entDados("Peso Liquido: ")));
                doce.setMarca(l.entDados("Marca do produto: "));

                doce.impRelatorio();
                System.out.println("Farmacia da cidade de " +doce.getFarmacia().getCidade());
                System.out.println("Rua: " +doce.getFarmacia().getRua());
                System.out.println("Telefone: " +doce.getFarmacia().getTelefone());
                System.out.println("\nDoce alterado:");
                System.out.println("Nome: " +doce.getNome());
                System.out.println("Unidades em estoque: " +doce.getQuantidade());
                System.out.println("Preco: " +doce.getPreco());
                System.out.println("Tipo: " +doce.getTipo());
                System.out.println("Tamanho: " +doce.getSabor());
                System.out.println("Peso Liquido: " +doce.getPesoLiq());
                System.out.println("Marca: " +doce.getMarca());

                break;

                default:
                System.out.println("Opcao invalida");
                break;
            }
        }
    }

}
