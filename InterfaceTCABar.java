public class InterfaceTCABar {

    //Variáveis a serem declaradas
    public final static int numeroquenaodevesermencionado = 14-1;
    static boolean comecar1x1 = false;
    static boolean comecarmultijogador = false;
    static boolean cenacreditos = false;
    static boolean comecarpartida = false;
    
    public static void exibirCreditos() {

        //todas as telas possíveis para o usuário
        String creditos = """
                
        ╔═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╗
        ║                           █                                        ║                                                     
        ║                          █                                         ║   
        ║            ███  ████  █████ ████  ███ █████  ███   ████            ║ 
        #           █     █   █ █     █   █  █    █   █   █ █                # 
        ║           █     ████  ████  █   █  █    █   █   █  ███             ║
        ║           █     █  █  █     █   █  █    █   █   █     █            ║
        ║            ███  █   █ █████ ████  ███   █    ███  ████             ║                                                      
        #                                                                    #              
        ║                                                                    ║ 
        ║             Professores de Linguagens de Programação I:            ║ 
        ║                                                                    ║ 
        #                     Hebert Rausch Fernandes                        # 
        ║                      Thiago Berticelli Ló                          ║ 
        ║                                                                    ║ 
        ║                                                                    ║ 
        #                        Criadores do jogo:                          # 
        ║                   José Fernando Lewandoski Neto                    ║ 
        ║                                                                    ║ 
        ║                                                                    ║ 
        #                                                                    # 
        ║                                                                    ║ 
        ║                                                                    ║ 
        ║                                       Pressione ESC para retornar. ║ 
        ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝

                """;
        System.out.print(creditos);
    }
    public static void imprimirInterface() {


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
        #                   --> (Modo multijogador 1x1)                      # 
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
        #                    --> (Modo multijogador 1x1)                     # 
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
        ║                  --> (Modo multijogador caos)                      ║ 
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
        ║                      Modo multijogador caos                        ║ 
        ║                         --> (ver créditos)                         ║ 
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
        ║                  --> (Modo multijogador caos)                      ║ 
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
        ║                        --> (ver créditos)                          ║ 
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

                    case numeroquenaodevesermencionado:
                    case '\n':
                        comecarpartida = true;
                        comecar1x1 = true;
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

                    case numeroquenaodevesermencionado:
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
                    
                    case numeroquenaodevesermencionado:
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
        imprimirInterface();
    }
}