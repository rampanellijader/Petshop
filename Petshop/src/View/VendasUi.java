
package View;

import ViewMenu.VendasMenu;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import util.Console;
import View.PetUi;
import model.Cliente;
import model.Pet;
import model.Servico;
import model.VendaServicos;
import repositorio.RepositorioClientes;
import repositorio.RepositorioPet;
import repositorio.RepositorioServicos;
import repositorio.RepositorioVendas;


public class VendasUi {
   public void executar(){
       int opcao =0;
      do{
          System.out.println(VendasMenu.getOpcoes());
         switch(opcao){
             case VendasMenu.OP_REGISTRAR:
                 RegistarVenda();
            break;  
             case VendasMenu.OP_LISTAR:
                 ListarVendas();
             break;
              case VendasMenu.OP_VOLTAR:
                System.out.println("Retornando ao menu inicial!"); 
             break;        
           default: System.out.println("Opção inválida..");
         } 
      } while(opcao != VendasMenu.OP_VOLTAR);
       
   } 

    private void RegistarVenda() {
       DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate dataHora = LocalDate.now();
       System.out.println(dataHora.format(formatador));
        System.out.println("Relacione o cliente venda: ");
        new ClienteUi().listarCliente();
        String rg = Console.scanString("Informe o RG do cliente: ");
        Cliente cliente = RepositorioClientes.getInstance().BuscarCliente(rg);
        System.out.println("Relacione o pet venda: ");
        new PetUi().listarPet();
        String nome = Console.scanString("Informe o nome do pet: ");
        Pet pet = RepositorioPet.getInstance().BuscarPet(nome);
        System.out.println("Relacione o serviço a venda: ");
        new ServicoUi().listaServico();
        Servico servico = RepositorioServicos.getInstance().BuscarServico(nr_servico);
          
        RepositorioVendas.getInstance().add(new VendaServicos(dataHora, cliente, pet, servico));
        
       
       
    }

    private void ListarVendas() {

    }
}
