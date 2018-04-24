
package View;

import ViewMenu.MainMenu;
import ViewMenu.ServicoMenu;
import model.Servico;
import repositorio.RepositorioServicos;
import util.Console;


public class ServicoUi {
        
    public void executar() {
      int opcao =0;
      
    do{System.out.println(ServicoMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
        switch(opcao)    {
        case ServicoMenu.OP_CADASTRAR:
            cadastrarServico();
          break;
        case ServicoMenu.OP_LISTAR:
           listaServico();
          break;
        case ServicoMenu.OP_VOLTAR:
           System.out.println("Retornando ao menu inicial!"); 
             break;        
           default: System.out.println("Opção inválida..");  
          
            
        }
        
        
    }  while(opcao != ServicoMenu.OP_VOLTAR);
    }

    private void cadastrarServico() {
        String nm_servico = Console.scanString("Informe o serviço desejado: ");
        String tp_atendimento = Console.scanString("Tipo de atendimento(clínico ou estético): ");
        Double preco = Console.scanDouble("Preço: ");
        RepositorioServicos.getInstance().add(new Servico(nm_servico, tp_atendimento, preco));
        System.out.println("Serviço " + nm_servico + " cadastrado com sucesso!");
    }

    public void listaServico() {
       if(RepositorioServicos.getInstance().estaVazio()){
           System.out.println("-----------------------------");        
            System.out.println("Nao ha serviços cadastrados");
            System.out.println("-----------------------------\n");
       } else{
           System.out.println("-----------------------------\n");
           System.out.println(String.format("%-10s", "CÓDIGO") + "\t"
                    + String.format("%-20s", "|NOME") + "\t"
                    + String.format("%-20s", "|TIPO")+ "\t"
                    + String.format("%-20s", "|PREÇO"));
           for(Servico servico : RepositorioServicos.getInstance().getServico()){
               System.out.println(String.format("%-10s", servico.getNr_servico()) + "\t"
                        + String.format("%-20s", "|" + servico.getNm_servico()) + "\t"
                        + String.format("%-20s", "|" + servico.getTp_atendimento()) + "\t"
                        + String.format("%-10s", "|" + servico.getPreco()));
           }
       }
    }
    
}
