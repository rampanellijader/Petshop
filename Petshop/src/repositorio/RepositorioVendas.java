
package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.VendaServicos;

public class RepositorioVendas {
  private List<VendaServicos> vendas; 
  private static RepositorioVendas instance = null;
  
   private  RepositorioVendas(){
       vendas = new ArrayList<VendaServicos>();
   }
    public static RepositorioVendas getInstance(){
      if(instance == null)  instance = new RepositorioVendas();
       return instance;
    }
     public boolean add(VendaServicos venda){
        return vendas.add(venda);
    }
     
     public boolean VendaExiste(int codigo){
        for(VendaServicos venda : vendas){
        if(venda.getCodigo()== codigo){
            return true;
         }
      }
        return false;
        
    }
  public  VendaServicos BuscarVenda(int codigo){
         for(VendaServicos venda : vendas){
        if(venda.getCodigo() == codigo){
            return venda;
        }
         
 }      return null;
  


} 
}
