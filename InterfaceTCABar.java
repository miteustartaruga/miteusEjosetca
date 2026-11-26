public class InterfaceTCABar {

    // Variáveis a serem declaradas
    public final static int numeroquenaodevesermencionado = 14 - 1;
    static boolean comecar1x1 = false;
    static boolean comecarmultijogador = false;
    static boolean cenacreditos = false;
    static boolean comecarpartida = false;
    static String vitoria1 = """

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
            ║                                                                    ║
            ║    ████████  ██     ████████  ██   ██   ████████  ████████    ██   ║
            #    ██    ██  ██     ██    ██  ██   ██   ██        ██     █    ██   #
            ║    ████████  ██     ████████   ████     ████████  ████████    ██   ║
            ║    ██        ██     ██    ██     ██     ██        ██  ██      ██   ║
            ║    ██        █████  ██    ██     ██     ████████  ██    ██    ██   ║
            #                                                                    #
            ║                                   ██      ██   ██   ████    ██     ║
            ║                                   ██  ██  ██   ██   ██  ██  ██     ║
            ║     ©2026 JFLN MIT Co.            ████  ████   ██   ██    ████     ║
            ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝
        """;

    static String vitoria2 = """

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
            ║                                                                    ║
            ║   ████████  ██     ████████  ██   ██  ████████  ████████  █████    ║
            #   ██    ██  ██     ██    ██  ██   ██  ██        ██     █       ██  #
            ║   ████████  ██     ████████   ████    ████████  ████████      ██   ║
            ║   ██        ██     ██    ██     ██    ██        ██  ██      ██     ║
            ║   ██        █████  ██    ██     ██    ████████  ██    ██  ██████   ║
            #                                                                    #
            ║                                   ██      ██   ██   ████    ██     ║
            ║                                   ██  ██  ██   ██   ██  ██  ██     ║
            ║     ©2026 JFLN MIT Co.            ████  ████   ██   ██    ████     ║
            ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝
     """;

    public static void exibirCreditos() {

        // todas as telas possíveis para o usuário
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
            #                        Criadores do jogo :                         #
            ║                   José Fernando Lewandoski Neto                    ║
            ║                 Mateus Fernando Roman De Oliveira                  ║
            ║                                                                    ║
            #                                                                    #
            ║                                                                    ║
            ║                                                                    ║
            ║                                       Pressione ESC para retornar. ║
            ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝

        """;
        WoW.mudarCor(83);
        System.out.print(creditos);
    }

    public static void imprimirInterface() {
        int art = 1;
        

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
                ║  ©2026 JFLN MIT Co.                                                ║
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
                ║    ©2026 JFLN MIT Co.                                              ║
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
                ║    ©2026 JFLN MIT Co.                                              ║
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
                ║                      --> (ver créditos)                            ║
                ║                                                                    ║
                #             *Erro, considere digitar uma tecla válida              #
                ║    ©2026 JFLN MIT Co.                                              ║
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
                ║    ©2026 JFLN MIT Co.                                              ║
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
                ║                      --> (ver créditos)                            ║
                ║                                                                    ║
                #                                                                    #
                ║    ©2026 JFLN MIT Co.                                              ║
                ║                                                                    ║
                ║                                           Pressione ESC para sair. ║
                ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝
        """;
        WoW.mudarCor(WoW.AZUL);
        JoseeMateusTabuleiroeRegrasTCA.limparTela();
        System.out.print(arte);
        while (!comecarpartida) {

            int teclaDigitada = ControleTeclasJogoComJNA.obtemTeclaPressionada();
            TocarSom.tocarSom("sons/som_movimento_peca.wav", false);
                
            switch (teclaDigitada) {

                case numeroquenaodevesermencionado:
                case '\n':
                    comecarpartida = true;
                    if(art == 1) {
                        
                        comecar1x1 = true;
                    } else if (art == 2) {

                        comecarmultijogador = true;
                    } else {

                        cenacreditos = true;
                    }       
                    break;    
                case 'w':
                case 'W':
                    art--;
                    if (art < 1) {
                        art = 3;
                    }
                    break;
                case 's':
                case 'S':
                    art++;
                    if (art > 3) {
                        art = 1;
                    }
                    break;
                default:
                    
                    arte = arteerro1;
                    break;
            }

            switch (art) {
                
                case 1:
                    
                    arte = arte1x1;
                    break;
                case 2:

                    arte = artemultijogador;
                    break;
                case 3:

                    arte = artecreditos;
                    break;
                default:

                    arte = arteerro1;
                    break;
            }

            if(cenacreditos) {
                continue;
            }
            JoseeMateusTabuleiroeRegrasTCA.limparTela();
            System.out.print(arte);
        }
        return;
    }
}
