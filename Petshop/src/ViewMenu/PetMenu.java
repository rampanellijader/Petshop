
package ViewMenu;


public class PetMenu {
    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    public static final int OP_VOLTAR =0;
    
    
     public static String getOpcoes() {
        return ("\n--------------------------------------\n"
                + "1- Cadastrar Pets\n"
                + "2- Listar Pets\n"
                + "0- Voltar"
                + "\n--------------------------------------");
     }
    
}
