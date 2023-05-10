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
        int opCid = 0;
        boolean continua = true;
        String cidade = "";
        String nomeFunc = "";

        
        System.out.println("========== Cadastro de Estoque ==========");
        nomeFunc = (l.entDados("\nDigite seu nome: "));
        System.out.println("\nEscolha a farmacia: ");
        System.out.println("1 - Apucarana");
        System.out.println("2 - Londrina ");
        System.out.println("3 - Ibaiti");
        do{
            while(continua){
                try{
                    opCid = Integer.parseInt(l.entDados("\nEscolha a opcao: "));
                    break;
                }
        
                catch(NumberFormatException nfe){
                    System.out.println("Deve ser um numero. erro --> " +nfe);
                }
            }

            switch(opCid){
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
        } while(opCid != 1 && opCid != 2 && opCid != 3);

        while(continua){
            do{
                System.out.println("\nEscolha o tipo de produto: ");
                System.out.println("1 - Medicamento");
                System.out.println("2 - Ortopedico");
                System.out.println("3 - Doce");
                System.out.println("4 - Sair");
                try{
                    opcao = Integer.parseInt(l.entDados("\nEscolha a opcao: "));
                    break;
                }
                catch(NumberFormatException nfe){
                    System.out.println("Deve ser um numero. erro --> " +nfe);
                }
            }while(opcao != 1 && opcao != 2 && opcao != 3);
            
            switch(opcao){
                case 1:
                System.out.println("\nDigite os dados do estoque: ");
                medic.getFarmacia().setNomeFunc(nomeFunc);
                medic.getFarmacia().setCidade(cidade);
                while(continua){
                    try{
                        medic.setNome(l.entDados("Nome do medicamento: "));
                        break;
                    }
                    catch(CaractereMaxException cmaxe){
                        cmaxe.impCaractereMax();
                    }
                    catch(CaractereMinException cmine){
                        cmine.impCaractereMin();
                    }
                }
                while(continua){
                    try{
                        medic.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                        break;
                    } 
                    catch(NumberFormatException nfe){
                        System.out.println("Erro! Digite um numero");
                    }
                    catch(NumNegativoException nne) {
                        nne.impNumNegativo();
                    }
                    catch(QuantidadeMaxException qme){
                        qme.impQuantidadeMax();
                    }
                }
                while(continua){
                    try{
                        medic.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                        break;
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Erro! Digite um numero");
                    }
                    catch(NumNegativoException nne) {
                        nne.impNumNegativo();
                    }
                }
                while(continua){
                    try{
                        medic.setLaboratorio(l.entDados("Nome do laboratorio: "));
                        break;
                    }
                    catch(CaractereMaxException cmaxe){
                        cmaxe.impCaractereMax();
                    }
                    catch(CaractereMinException cmine){
                        cmine.impCaractereMin();
                    }
                }
                medic.setDosagem(Integer.parseInt(l.entDados("Dosagem (em miligramas):")));

                medic.impRelatorio();
                break;

                case 2:
                System.out.println("Digite os dados do estoque: ");
                orto.getFarmacia().setNomeFunc(nomeFunc);
                orto.getFarmacia().setCidade(cidade);
                while(continua){
                    try{
                        orto.setNome(l.entDados("Nome do produto: "));
                        break;
                    }
                    catch(CaractereMaxException cmaxe){
                        cmaxe.impCaractereMax();
                    }
                    catch(CaractereMinException cmine){
                        cmine.impCaractereMin();
                    }
                }

                while(continua){
                    try{
                        orto.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                        break;
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Erro! Digite um numero");
                    }
                    catch(NumNegativoException nne){
                        nne.impNumNegativo();
                    }
                    catch(QuantidadeMaxException qme){
                        qme.impQuantidadeMax();
                    }
                }
                while(continua){
                    try{
                        orto.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Erro! Digite um numero");
                    }
                    catch(NumNegativoException nne) {
                        nne.impNumNegativo();
                    }
                }
                do{ 
                    System.out.println("\nTamanhos:");
                    System.out.println("P - Pequeno");
                    System.out.println("M - Medio");
                    System.out.println("G - Grande");
                    orto.switchOrto(l.entDados("Selecione: ").charAt(0));
                } while(orto.getTamanho() != "Pequeno" && orto.getTamanho() != "Grande" && orto.getTamanho() != "Medio");
                do{
                    System.out.println("\nTipos de ortopedico:");
                    System.out.println("1 - Joelheira");
                    System.out.println("2 - Tala");
                    System.out.println("3 - Tornozeleira");
                    System.out.println("4 - Cinta");
                    System.out.println("5 - Espaldeira");
                    try{
                        orto.switchOrto(Integer.parseInt(l.entDados("Selecione: ")));
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Erro! Digite um numero");
                    }
                } while(orto.getTipo() != "Joelheira" && orto.getTipo() != "Tornozeleira" && orto.getTipo() != "Cinta" && orto.getTipo() != "Tala" &&orto.getTipo() != "Espaldeira");
                orto.impRelatorio();
                break;

                case 3:
                System.out.println("Digite os dados do estoque: ");
                doce.getFarmacia().setNomeFunc(nomeFunc);
                doce.getFarmacia().setCidade(cidade);
                while(continua){
                    try{
                        doce.setNome(l.entDados("Nome do produto: "));
                        break;
                    }
                    catch(CaractereMaxException cmaxe){
                        cmaxe.impCaractereMax();
                    }
                    catch(CaractereMinException cmine){
                        cmine.impCaractereMin();
                    }
                }
                while(continua){
                    try{
                        doce.setQuantidade(Integer.parseInt(l.entDados("Quantidade no estoque: ")));
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Erro! Digite um numero");
                    }
                    catch(NumNegativoException nne) {
                        nne.impNumNegativo();
                    }
                    catch(QuantidadeMaxException qme){
                        qme.impQuantidadeMax();
                    }
                }
                while(continua){
                    try{
                        doce.setPreco(Float.parseFloat(l.entDados("Preco: ")));
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Erro! Digite um numero");
                    }
                    catch(NumNegativoException nne){
                        nne.impNumNegativo();
                    } 
                }
                do{
                    System.out.println("\nTipos de Doces:");
                    System.out.println("1 - Bala");
                    System.out.println("2 - Chocolate");
                    System.out.println("3 - Chiclete");
                    System.out.println("4 - Pirulito");
                    try{
                        doce.switchTipo(Integer.parseInt(l.entDados("Tipo: ")));
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Erro! Digite um numero: ");
                    }
                }while(doce.getTipo() != "Bala" && doce.getTipo() != "Chocolate" && doce.getTipo() != "Chiclete" && doce.getTipo() != "Pirulito");
                doce.setSabor(l.entDados("Sabor: "));
                doce.impRelatorio();
                break;

                case 4:
                continua = false;
                break;

                default:
                System.out.println("Opcao invalida");
                break;
            }
        }
    }
}
