public class InterfaceTCABar {

    // Variáveis a serem declaradas
    public final static int numeroquenaodevesermencionado = 14 - 1;
    static boolean comecar1x1 = false;
    static boolean comecarmultijogador = false;
    static boolean cenacreditos = false;
    static boolean comecarpartida = false;

    public static void exibirCreditos() {

        // todas as telas possíveis para o usuário
        String creditos = """
                \n\n\n
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
        WoW.mudarCor(4);
        System.out.print(creditos);
        WoW.mudarCor(7);
    }

    public static void imprimirInterface() {
        int art = 1;

        String arte = """
                \n\n\n
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
                \n\n\n
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
                \n\n\n
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
                \n\n\n
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
                ║    ©2026 JFLN MIT Co.                                              ║
                ║                                                                    ║
                ║                                           Pressione ESC para sair. ║
                ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝

                """;
        String artemultijogador = """
                 \n\n\n
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
                \n\n\n
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
                ║    ©2026 JFLN MIT Co.                                              ║
                ║                                                                    ║
                ║                                           Pressione ESC para sair. ║
                ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝
                                """;
        WoW.mudarCor(4);
        System.out.print(arte);
        WoW.mudarCor(7));

        while (!comecarpartida) {

            int teclaDigitada = ControleTeclasJogoComJNA.obtemTeclaPressionada();
                
            switch (teclaDigitada) {

                case numeroquenaodevesermencionado:
                case '\n':
                    if (art == 1 || art == 2) {
                        comecar1x1 = true;
                        comecarpartida = true;
                        break;
                    } else {
                        cenacreditos = !cenacreditos;
                        exibirCreditos();
                        break;
                    }

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
            }

            arte = switch (art) {
                case 1 -> arte1x1;
                case 2 -> artemultijogador;
                case 3 -> artecreditos;
                default -> arteerro1;
            };

            if(cenacreditos) {
                continue;
            }
            System.out.print(arte);
        }
        return;
    }

    public static void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        limparConsole();
        imprimirInterface();

    }
}