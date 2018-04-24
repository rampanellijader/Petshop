
package ViewMenu;

public class VendasMenu {
    public static final int OP_REGISTRAR = 1;
    public static final int OP_LISTAR = 2;
    public static final int OP_VOLTAR =0;
    
    
     public static String getOpcoes() {
        return ("\n--------------------------------------\n"
                + "1- Registrar serviço prestado \n"
                + "2- Listar serviços\n"
                + "0- Voltar"
                + "\n--------------------------------------");
     }
    
    
}
