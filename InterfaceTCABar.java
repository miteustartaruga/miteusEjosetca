import java.util.Scanner;
public class InterfaceTCABar {
    

    public static void imprimirInterface(boolean comecarpartida) {


        String arte = """
            
        ╔═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╗
        ║                                                                    ║                                                     
        ║                                                                    ║   
        ║         ████   ███  ████  ████  ███  ███   ███  ████  █████ ™      ║ 
        #         █   █ █   █ █   █ █   █  █  █     █   █ █   █ █            # 
        ║         ████  █████ ████  ████   █  █     █████ █   █ ████         ║ 
        ║         █   █ █   █ █  █  █  █   █  █     █   █ █   █ █            ║ 
        ║         ████  █   █ █   █ █   █ ███  ███  █   █ ████  █████        ║ 
        #                                                                    # 
        ║                                                                    ║ 
        ║                    Selecione o modo de jogo:                       ║ 
        ║                                                                    ║ 
        #                   > (Modo multijogador 1x1)                        # 
        ║                      Modo multijogador caos                        ║ 
        ║                          ver créditos                              ║ 
        ║                                                                    ║ 
        #                                                                    # 
        ║  ©2026 JFLN Co.                                                    ║ 
        ║                                                                    ║ 
        ║                                           Pressione ESC para sair. ║ 
        ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝

            """; 
        String arte1x1 = arte;
        String arteerro1 = """
        ╔═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╗   
        ║                                                                    ║
        ║                                                                    ║   
        ║         ████   ███  ████  ████  ███  ███   ███  ████  █████ ™      ║ 
        #         █   █ █   █ █   █ █   █  █  █     █   █ █   █ █            # 
        ║         ████  █████ ████  ████   █  █     █████ █   █ ████         ║ 
        ║         █   █ █   █ █  █  █  █   █  █     █   █ █   █ █            ║ 
        ║         ████  █   █ █   █ █   █ ███  ███  █   █ ████  █████        ║ 
        #                                                                    # 
        ║                                                                    ║ 
        ║                    Selecione o modo de jogo:                       ║ 
        ║                                                                    ║ 
        #                    > (Modo multijogador 1x1)                       # 
        ║                       Modo multijogador caos                       ║ 
        ║                          ver créditos                              ║ 
        ║                                                                    ║ 
        #             *Erro, considere digitar uma tecla válida              # 
        ║    ©2026 JFLN Co.                                                  ║ 
        ║                                                                    ║ 
        ║                                           Pressione ESC para sair. ║ 
        ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝     

                                """;
        String arteerro2 = """

        ╔═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╗   
        ║                                                                    ║
        ║                                                                    ║   
        ║         ████   ███  ████  ████  ███  ███   ███  ████  █████ ™      ║ 
        #         █   █ █   █ █   █ █   █  █  █     █   █ █   █ █            # 
        ║         ████  █████ ████  ████   █  █     █████ █   █ ████         ║ 
        ║         █   █ █   █ █  █  █  █   █  █     █   █ █   █ █            ║ 
        ║         ████  █   █ █   █ █   █ ███  ███  █   █ ████  █████        ║ 
        #                                                                    # 
        ║                                                                    ║ 
        ║                    Selecione o modo de jogo:                       ║ 
        ║                                                                    ║ 
        #                       Modo multijogador 1x1                        # 
        ║                    > (Modo multijogador caos)                      ║ 
        ║                          ver créditos                              ║ 
        ║                                                                    ║ 
        #             *Erro, considere digitar uma tecla válida              # 
        ║    ©2026 JFLN Co.                                                  ║ 
        ║                                                                    ║ 
        ║                                           Pressione ESC para sair. ║ 
        ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝ 

        """;
        String arteerro3 = """

        ╔═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╗   
        ║                                                                    ║
        ║                                                                    ║   
        ║         ████   ███  ████  ████  ███  ███   ███  ████  █████ ™      ║ 
        #         █   █ █   █ █   █ █   █  █  █     █   █ █   █ █            # 
        ║         ████  █████ ████  ████   █  █     █████ █   █ ████         ║ 
        ║         █   █ █   █ █  █  █  █   █  █     █   █ █   █ █            ║ 
        ║         ████  █   █ █   █ █   █ ███  ███  █   █ ████  █████        ║ 
        #                                                                    # 
        ║                                                                    ║ 
        ║                    Selecione o modo de jogo:                       ║ 
        ║                                                                    ║ 
        #                       Modo multijogador 1x1                        # 
        ║                       Modo multijogador caos                       ║ 
        ║                         > (ver créditos)                           ║ 
        ║                                                                    ║ 
        #             *Erro, considere digitar uma tecla válida              # 
        ║    ©2026 JFLN Co.                                                  ║ 
        ║                                                                    ║ 
        ║                                           Pressione ESC para sair. ║ 
        ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝ 

        """;
        String artemultijogador = """
                            
        ╔═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╗
        ║                                                                    ║                                                       
        ║                                                                    ║   
        ║         ████   ███  ████  ████  ███  ███   ███  ████  █████ ™      ║ 
        #         █   █ █   █ █   █ █   █  █  █     █   █ █   █ █            # 
        ║         ████  █████ ████  ████   █  █     █████ █   █ ████         ║ 
        ║         █   █ █   █ █  █  █  █   █  █     █   █ █   █ █            ║ 
        ║         ████  █   █ █   █ █   █ ███  ███  █   █ ████  █████        ║ 
        #                                                                    # 
        ║                                                                    ║ 
        ║                    Selecione o modo de jogo:                       ║ 
        ║                                                                    ║ 
        #                       Modo multijogador 1x1                        # 
        ║                    > (Modo multijogador caos)                      ║ 
        ║                          ver créditos                              ║ 
        ║                                                                    ║ 
        #                                                                    # 
        ║    ©2026 JFLN Co.                                                  ║ 
        ║                                                                    ║ 
        ║                                           Pressione ESC para sair. ║ 
        ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝

                            """;
        String artecreditos = """

        ╔═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╗
        ║                                                                    ║                                                       
        ║                                                                    ║   
        ║         ████   ███  ████  ████  ███  ███   ███  ████  █████ ™      ║ 
        #         █   █ █   █ █   █ █   █  █  █     █   █ █   █ █            # 
        ║         ████  █████ ████  ████   █  █     █████ █   █ ████         ║ 
        ║         █   █ █   █ █  █  █  █   █  █     █   █ █   █ █            ║ 
        ║         ████  █   █ █   █ █   █ ███  ███  █   █ ████  █████        ║ 
        #                                                                    # 
        ║                                                                    ║ 
        ║                    Selecione o modo de jogo:                       ║ 
        ║                                                                    ║ 
        #                       Modo multijogador 1x1                        # 
        ║                       Modo multijogador caos                       ║ 
        ║                         > (ver créditos)                           ║ 
        ║                                                                    ║ 
        #                                                                    # 
        ║    ©2026 JFLN Co.                                                  ║ 
        ║                                                                    ║ 
        ║                                           Pressione ESC para sair. ║ 
        ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝     
                        """;
        
        System.out.print(arte);
        while (true) {

            if(arte.equals(arte1x1)) {

                int teclaDigitada = ControleTeclasJogoComJNA.obtemTeclaPressionada();
                switch (teclaDigitada) {

                    case '\n':
                        comecarpartida = true;
                        break;
                    
                    case 's':
                    case 'S':
                        arte = artemultijogador;    
                        break;
                    default:
                        arte = arteerro1;
                }
            } else if (arte.equals(artemultijogador)) {

                int teclaDigitada = ControleTeclasJogoComJNA.obtemTeclaPressionada();
                switch (teclaDigitada) {

                    case '\n':
                        comecarpartida = true;
                        break;
                    case 's':
                    case 'S':

                        arte = artecreditos;
                        break;
                    case 'w':
                    case 'W':

                        arte = arte1x1;
                        break;
                    default:

                    arte = arteerro2;
                    break;
                }
            } else {

                int teclaDigitada = ControleTeclasJogoComJNA.obtemTeclaPressionada();
                switch(teclaDigitada) {
                    
                    case '\n':
                        comecarpartida = true;
                        break;
                    case 'w':
                    case 'W':
                        arte = artemultijogador;
                        break;
                    default:
                        arte = arteerro3;
                        break;

                }
            }
            if (comecarpartida) {
                return;
            }
            System.out.print(arte);
        }
    }
    public static void main (String[]args) {
        boolean comecarpartida = false;
        imprimirInterface(comecarpartida);
    }
}