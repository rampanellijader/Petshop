
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;



public class VendaServicos {
  private LocalDateTime dataHora;
  private Cliente cliente;
  private Servico servico;
  private Pet pet;
  private int codigo;
  private static int cd_venda =1;
  
  

    public VendaServicos(LocalDateTime dataHora, Cliente cliente, Servico servico, Pet pet){
     this.dataHora = dataHora;
     this.cliente = cliente;
     this.servico = servico;
     this.pet = pet;
     this.codigo = generateCodigo();
     
    }

    
    
    public String toString(){
        return dataHora +" "+ cliente.getNome()+" "+servico.getNm_servico()+" "+getPet().getNome();
    }
    
    
    public LocalDateTime getData() {
        return dataHora;
    }
    
    
   
   /*   public boolean addHorario(Servico horario) {
        if(consultaExiste(horario.getData()))
            return false;
        return (Servico.add(horario));
      }
    */

    
    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }

   public int generateCodigo() {
        return (cd_venda++);
    }

   
    public Pet getPet() {
        return pet;
    }
    public int getCodigo() {
        return codigo;
    }
    
   
}
