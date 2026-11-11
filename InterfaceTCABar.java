import java.util.Scanner;
public class InterfaceTCABar {
    
    static Scanner LER = new Scanner (System.in);

    public static char lerTecla() {
        char letra = LER.next().charAt(0);
        return letra;
    }

    public static String imprimirInterface() {

        boolean sair = false;
        String arte = """
            
    ╔═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╗
    ║                                                                    ║                                                             
    ║                                                                    ║   
    ║         ████   ███  ████  ████  ███  ███   ███  ████  █████        ║ 
    #         █   █ █   █ █   █ █   █  █  █     █   █ █   █ █            # 
    ║         ████  █████ ████  ████   █  █     █████ █   █ ████         ║ 
    ║         █   █ █   █ █  █  █  █   █  █     █   █ █   █ █            ║ 
    ║         ████  █   █ █   █ █   █ ███  ███  █   █ ████  █████        ║ 
    #                                                                    # 
    ║                                                                    ║ 
    ║                    Selecione o modo de jogo:                       ║ 
    ║                                                                    ║ 
    #                     (Modo multijogador 1x1)                        # 
    ║                      Modo multijogador caos                        ║ 
    ║                          ver créditos                              ║ 
    ║                                                                    ║ 
    #                                                                    # 
    ║                                                                    ║ 
    ║                                                                    ║ 
    ║                                                                    ║ 
    ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝

            """; 
        while (true) {

            if(sair) {
                break;
            }
            char teclaDigitada = lerTecla();
            switch (teclaDigitada) {

                case '\n':
                    sair = true;
                    break;
                
                case 's':
                case 'S':
                    arte = """
                        
    ╔═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╗
    ║                                                                    ║                                                             
    ║                                                                    ║   
    ║         ████   ███  ████  ████  ███  ███   ███  ████  █████        ║ 
    #         █   █ █   █ █   █ █   █  █  █     █   █ █   █ █            # 
    ║         ████  █████ ████  ████   █  █     █████ █   █ ████         ║ 
    ║         █   █ █   █ █  █  █  █   █  █     █   █ █   █ █            ║ 
    ║         ████  █   █ █   █ █   █ ███  ███  █   █ ████  █████        ║ 
    #                                                                    # 
    ║                                                                    ║ 
    ║                    Selecione o modo de jogo:                       ║ 
    ║                                                                    ║ 
    #                       Modo multijogador 1x1                        # 
    ║                      (Modo multijogador caos)                      ║ 
    ║                          ver créditos                              ║ 
    ║                                                                    ║ 
    #                                                                    # 
    ║                                                                    ║ 
    ║                                                                    ║ 
    ║                                                                    ║ 
    ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝

                        """;
                    break;
                default:
                    arte = """
    ╔═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╗
    ║                                                                    ║                                                             
    ║                                                                    ║   
    ║         ████   ███  ████  ████  ███  ███   ███  ████  █████        ║ 
    #         █   █ █   █ █   █ █   █  █  █     █   █ █   █ █            # 
    ║         ████  █████ ████  ████   █  █     █████ █   █ ████         ║ 
    ║         █   █ █   █ █  █  █  █   █  █     █   █ █   █ █            ║ 
    ║         ████  █   █ █   █ █   █ ███  ███  █   █ ████  █████        ║ 
    #                                                                    # 
    ║                                                                    ║ 
    ║                    Selecione o modo de jogo:                       ║ 
    ║                                                                    ║ 
    #                      (Modo multijogador 1x1)                       # 
    ║                       Modo multijogador caos                       ║ 
    ║                          ver créditos                              ║ 
    ║                                                                    ║ 
    #             *Erro, considere digitar uma tecla válida              # 
    ║                                                                    ║ 
    ║                                                                    ║ 
    ║                                                                    ║ 
    ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝     

                            """;
            }
        }
        return arte;
    }
    public static void main (String[]args) {

    }
}