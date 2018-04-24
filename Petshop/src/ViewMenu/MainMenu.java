package ViewMenu;


public class MainMenu {
    public static final int OP_CLIENTES = 1;
    public static final int OP_PETS = 2;
    public static final int OP_SERVICOS = 3;
    public static final int OP_VENDAS = 4;
    public static final int OP_SAIR =0;
    
    
    

    public static String getOpcoes() {
        return ("\n--------------------------------------\n"
                + "1- Menu Clientes\n"
                + "2- Menu Pets\n"
                + "3- Menu Servicos\n"
                + "4- Menu Vendas\n"
                + "0- Sair da Aplicação"
                + "\n--------------------------------------");
    }   
}
