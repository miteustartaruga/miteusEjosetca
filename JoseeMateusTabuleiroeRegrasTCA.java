/* JOGO BARRICADE: O que é isso e sobre o que é o nosso projeto?
* Basicamente: Barricade é um jogo de 2 jogadores em que o objetivo
* principal é chegar até o outro lado do tabuleiro, mas para impedir
* o seu adversário de chegar até o outro lado do tabuleiro, você 
* pode colocar paredes na horizontal e na vertical para atrasar
* a chegada do seu oponente. Mas vale lembrar que você deve 
* deixar ao menos uma saída para que seja possível o seu 
* oponente criar uma forma de chegar até o fim.
*/

/*ATENÇÃO:
* Você deve rodar o código do jogo neste arquivo!!
*/
//Toda a importação de material deve ficar aqui em baixo antes do public class:
import java.util.Scanner;
public class JoseeMateusTabuleiroeRegrasTCA {

//Qualquer tipo de variável declarada fora do método main deve ficar aqui:
   
   static Scanner LER = new Scanner(System.in);
   static int[][] TABULEIRO = new int[9][9];
   static boolean[][] PAREDESHORIZONTAIS = new boolean[9][9];
   static boolean[][] PAREDESVERTICAIS = new boolean[9][9];
   static boolean pararjogada = false;
   static int turnojogador = 0;

//Aqui vão ficar os métodos que serão ativados dentro do método main:

    public static char lerLetra() {
        char letra = LER.next().charAt(0);
        return letra;
    }
    public static void imprimirTabuleiro() {
        
        //Essa parte do código aq imprime a legenda
        WoW.mudarCor(WoW.AMARELO);
        int letra = 65;
        System.out.print("   ");
        for(int j = 0; j < 9; j++) {

            System.out.print(" " + (char) letra + "  ");
            letra++;
        }
        System.out.println();
        for(int i = 0; i < 9; i++) {

            if(i == 0) {
                
                System.out.print("   +");
                for(int j = 0; j < 9; j++) {
                    System.out.print("---+");
                }
                System.out.println();
            }  

            System.out.print(i + 1 + " |");
            for(int j = 0; j < 9; j++) {
                char casadeinicio = ' ';
                if(TABULEIRO[i][j] == 1) {
                    
                    casadeinicio = '1';
                    WoW.mudarCor(WoW.AZUL);
                } else if (TABULEIRO[i][j] == 2) {
                    
                    casadeinicio = '2';
                    WoW.mudarCor(WoW.VERMELHO);
                }
                System.out.print(" " + casadeinicio + " ");
                WoW.mudarCor(WoW.AMARELO);

                //paredes usadas no jogo para impedir o inimigo
                
                if (j < 9 && PAREDESVERTICAIS[i][j]) {

                    WoW.mudarCor(165);
                    System.out.print("#");
                } else {

                    WoW.mudarCor(WoW.AMARELO);
                    System.out.print("|");
                }
            }   
            System.out.println();  
                
            System.out.print("   +");
            for (int j = 0; j < 9; j++) {
                if (i < 9 && PAREDESHORIZONTAIS[i][j]) {
                    
                    WoW.mudarCor(165);
                    System.out.print("===+");
                } else {

                    WoW.mudarCor(WoW.AMARELO);
                    System.out.print("---+");
                }
            }
            System.out.println();
        }
        System.out.println("Aperte 'G' para utilizar o modo de posicionar parede.");
    }
// A padronização do 033 serve para mostrar para o terminal que o teclado vai digitar um comando, que em hexadecimal é 27.
     public static void limparTela() {
        
        System.out.print("\033[3J"); // apaga o histórico
        System.out.print("\033[2J["); // apaga a tela
        System.out.print("\033[H");  // volta o cursor para o canto (1, 1)
        System.out.flush();          // garante que os comandos acima sejam enviados agora
    }

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
            ║                                        Pressione ESC para retornar.║
            ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝

        """;
        WoW.mudarCor(83);
        System.out.print(creditos);
        while (true) {
            char tecla = lerLetra();
            switch (tecla) {

                case 27:
                    return;
                case 64:
                    InterfaceTCABar.telaSecretaCodigos();
                    break;
                default:
                    WoW.mudarCor(196);
                    System.out.println("Digite SOMENTE ESC para sair.");
                    WoW.mudarCor(WoW.AZUL);
                    break;
            }
        }
    }
//A partir daqui fica o método main, basicamente o principal que sustenta o programa:
    public static void main (String[]args) {
        
        TABULEIRO [ControleTeclasJogoComJNA.posYJogador1] [ControleTeclasJogoComJNA.posXJogador1] = 1;
        TABULEIRO [ControleTeclasJogoComJNA.posYJogador2] [ControleTeclasJogoComJNA.posXJogador2] = 2;

        while (true) {    
            
            
            TocarSom.tocarSom("sons/musica_retro_tela_inicio.wav", false);
            InterfaceTCABar.imprimirInterface();
            
            if (InterfaceTCABar.cenacreditos) {

                exibirCreditos();
            }

            while (true) {

                if (InterfaceTCABar.comecar1x1) {
                    
                    if (verificarSeExisteVencedor() == true) {
                        
                        break;
                    } else {
                        
                        if(turnojogador % 2 == 0) {
                            
                            boolean jogadarealizada = ControleTeclasJogoComJNA.verificarMovimentacaoJogador1();
                            while (true) {
                                if(ControleTeclasJogoComJNA.jogardenovo) {
                                    
                                    jogadarealizada = ControleTeclasJogoComJNA.verificarMovimentacaoJogador1();
                                } else {
                                    
                                    break;
                                }
                            }
                            if(ControleTeclasJogoComJNA.redesenhar) {

                                limparTela();
                                imprimirTabuleiro();
                                ControleTeclasJogoComJNA.redesenhar = false;
                            }
                            if (jogadarealizada) {    
                                turnojogador++;
                            }
                            ControleTeclasJogoComJNA.esperar(100);
                        } else {   
                            
                            boolean jogadarealizada = ControleTeclasJogoComJNA.verificarMovimentacaoJogador2();
                            while (true) {
                                if(ControleTeclasJogoComJNA.jogardenovo) {
                                    
                                    jogadarealizada = ControleTeclasJogoComJNA.verificarMovimentacaoJogador2();
                                } else {
                                    
                                    break;
                                }
                            }
                            if(ControleTeclasJogoComJNA.redesenhar) {

                                limparTela();
                                imprimirTabuleiro();
                                ControleTeclasJogoComJNA.redesenhar = false;
                            }
                            if (jogadarealizada) {
                                turnojogador++;
                            }
                            ControleTeclasJogoComJNA.esperar(100);
                        }
                    }
                    
                } else if (InterfaceTCABar.comecarmultijogador) {

                    String recado = """

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
            #      * Sinto muito, mas esse modo de jogo ainda não foi concluído  # 
            ║    ©2026 JFLN Co.                                                  ║ 
            ║                                                                    ║ 
            ║                                           Pressione ESC para sair. ║ 
            ╚═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*═══*════╝
                """;
                    WoW.mudarCor(WoW.VERMELHO);
                    InterfaceTCABar.comecarmultijogador = false;
                    System.out.print(recado);
                }
            
            }
        
            if (ControleTeclasJogoComJNA.posYJogador1 == 0) {

                TocarSom.tocarSom("sons/trilha_vitoria_retro (1).wav", false);
                WoW.mudarCor(87);
                System.out.print(InterfaceTCABar.vitoria1);
                break;

            } else if (ControleTeclasJogoComJNA.posYJogador2 == 8) {

                TocarSom.tocarSom("sons/trilha_vitoria_retro (1).wav", false);
                WoW.mudarCor(196);
                System.out.print(InterfaceTCABar.vitoria2);
                break;
            }
        }
    }
    public static boolean verificarSeExisteVencedor() {
            
        boolean algumVencedor = false;
        if (ControleTeclasJogoComJNA.posYJogador1 == 0 || ControleTeclasJogoComJNA.posYJogador2 == 8) {

            algumVencedor = true;
        }
        return algumVencedor;
    }

    static int BarreirasJogador1 = 10;
    static int BarreirasJogador2 = 10;
    public static void modoPosicionarParedes() {

        if (BarreirasJogador1 >= 1) {
            
            verificarMovimentacaoDasParedes();
            verificarSeHaMaisde8();
            BarreirasJogador1--;
            System.out.println("Número restante de barreiras do jogador 1: " + BarreirasJogador1);
        } else if (BarreirasJogador2 >= 1) {

            verificarMovimentacaoDasParedes();
            verificarSeHaMaisde8();
            BarreirasJogador2--; 
                        System.out.println("Número restante de barreiras do jogador 2: " + BarreirasJogador2);
        } else {

            System.out.println("Sinto muito, suas barreiras acabaram!");
        }
        
    }

    public static void verificarMovimentacaoDasParedes() {

        boolean paredeHorizontal = true;  
        WoW.mudarCor(195);    
        System.out.println("Para escolher o tipo de parede a ser selecionada, digite 1 (Horizonal) ou 0 (Vertical) ");
            while (true) {   
                int parede = ControleTeclasJogoComJNA.obtemTeclaPressionada(); 
                switch (parede) {
                    case 48:
                        paredeHorizontal = false;
                        break;
                    case 49:
                        paredeHorizontal = true;
                        break;
                    default:
                        WoW.mudarCor(196); 
                        System.out.println("Erro, digite 0 ou 1.");
                        WoW.mudarCor(WoW.AMARELO);
                        break;
                }
                if (parede == 48 || parede == 49) {
                    
                    break;
                }
            }
        if (paredeHorizontal) {

            while (true) {
                
                System.out.println("Digite as coordenadas que você vai posicionar a sua parede. Digite a coordenada X");
                int posicaoX = ControleTeclasJogoComJNA.obtemTeclaPressionada();
                WoW.mudarCor(159);
                System.out.println("Agora digite a coordenada Y");
                WoW.mudarCor(WoW.AMARELO);
                int posicaoY = ControleTeclasJogoComJNA.obtemTeclaPressionada();
                int casacorretaX = 0;
                int casacorretaY = 0;
                switch(posicaoX) {

                    case 65:
                    case 97:
                        casacorretaX = 0;
                        break;
                    case 66:
                    case 98:
                        casacorretaX = 1;
                        break;
                    case 67:
                    case 99:
                        casacorretaX = 2;
                        break;
                    case 68:
                    case 100:
                        casacorretaX = 3;
                        break;
                    case 69:
                    case 101:
                        casacorretaX = 4;
                        break;
                    case 70:
                    case 102:
                        casacorretaX = 5;
                        break;
                    case 71:
                    case 103:
                        casacorretaX = 6;
                        break;
                    case 72:
                    case 104:
                        casacorretaX = 7;
                        break;
                    case 73:
                    case 105:
                        casacorretaX = 8;
                        break;
                    default:
                    WoW.mudarCor(196);    
                    System.out.println("Por favor, digite um caractere válido.");
                    WoW.mudarCor(WoW.AMARELO);
                        break;
                    }        
                    
                switch (posicaoY) {

                    case 49:
                        casacorretaY = 0;
                        break;
                    case 50:
                        casacorretaY = 1;
                        break;
                    case 51:
                        casacorretaY = 2;
                        break;
                    case 52:
                        casacorretaY = 3;
                        break;
                    case 53:
                        casacorretaY = 4;
                        break;
                    case 54:
                        casacorretaY = 5;
                        break;
                    case 55:
                        casacorretaY = 6;
                        break;
                    case 56:
                        casacorretaY = 7;
                        break;
                    case 57:
                        casacorretaY = 8;
                        break;
                    default:
                    WoW.mudarCor(196);    
                    System.out.println("Por favor, digite um número válido.");
                    WoW.mudarCor(WoW.AMARELO);
                        break;
                }
                
                if ((posicaoX >= 65 && posicaoX <= 73) || (posicaoX >= 96 && posicaoX <= 106) && posicaoY >= 47 && posicaoY <= 58) {

                    PAREDESHORIZONTAIS [casacorretaY][casacorretaX] = true;
                    limparTela();
                    imprimirTabuleiro();
                } 
                break;
            }      
        } else {

            while (true) {
                
                System.out.println("Digite as coordenadas que você vai posicionar a sua parede. Digite a coordenada X");
                int posicaoX = ControleTeclasJogoComJNA.obtemTeclaPressionada();
                System.out.println("Agora digite a coordenada Y");
                int posicaoY = ControleTeclasJogoComJNA.obtemTeclaPressionada();
                int casacorretaX = 0;
                int casacorretaY = 0;
                
                switch(posicaoX) {

                    case 65:
                    case 97:
                        casacorretaX = 0;
                        break;
                    case 66:
                    case 98:
                        casacorretaX = 1;
                        break;
                    case 67:
                    case 99:
                        casacorretaX = 2;
                        break;
                    case 68:
                    case 100:
                        casacorretaX = 3;
                        break;
                    case 69:
                    case 101:
                        casacorretaX = 4;
                        break;
                    case 70:
                    case 102:
                        casacorretaX = 5;
                        break;
                    case 71:
                    case 103:
                        casacorretaX = 6;
                        break;
                    case 72:
                    case 104:
                        casacorretaX = 7;
                        break;
                    case 73:
                    case 105:
                        casacorretaX = 8;
                        break;
                    default:
                        WoW.mudarCor(196);
                        System.out.println("Por favor, digite um caractere válido.");
                        WoW.mudarCor(WoW.AMARELO);
                        break;
                }

                switch(posicaoY) {

                    case 49:
                        casacorretaY = 0;
                        break;
                    case 50:
                        casacorretaY = 1;
                        break;
                    case 51:
                        casacorretaY = 2;
                        break;
                    case 52:
                        casacorretaY = 3;
                        break;
                    case 53:
                        casacorretaY = 4;
                        break;
                    case 54:
                        casacorretaY = 5;
                        break;
                    case 55:
                        casacorretaY = 6;
                        break;
                    case 56:
                        casacorretaY = 7;
                        break;
                    case 57:
                        casacorretaY = 8;
                        break;
                    default:
                        WoW.mudarCor(196);
                        System.out.println("Por favor, digite um caractere válido.");
                        WoW.mudarCor(WoW.AMARELO);
                        break;
                }
            
                if ((posicaoX >= 65 && posicaoX <= 73) || (posicaoX >= 96 && posicaoX <= 106) && posicaoY >= 47 && posicaoY <= 58) {

                    PAREDESVERTICAIS [casacorretaY][casacorretaX] = true;
                    limparTela();
                    imprimirTabuleiro();
                }
                break;
            }
        
        }  
    
    }

    public static void verificarSeHaMaisde8() {

        int quantidadeparedesH = 0;
        int quantidadeparedesV = 0;
        for(int i = 0; i < 9; i++) {

            for(int j = 0; j < 9; j++) {

                if (PAREDESHORIZONTAIS[i] [j]) {

                    quantidadeparedesH++;
                } 
                if (PAREDESVERTICAIS[i] [j]) {

                    quantidadeparedesV++;
                }
                if (quantidadeparedesH == 9) {

                    PAREDESHORIZONTAIS [i] [j] = false;
                    WoW.mudarCor(196);
                    System.out.println("Erro, é necessário que haja ao menos 1 saída para o fim do tabuleiro.");
                    WoW.mudarCor(WoW.AMARELO);
                }
                if(quantidadeparedesV == 9) {

                    PAREDESVERTICAIS [i] [j] = false;
                    WoW.mudarCor(196);
                    System.out.println("Erro, é necessário que haja ao menos 1 saída para o fim do tabuleiro.");
                    WoW.mudarCor(WoW.AMARELO);
                }
            }

        }
    }

}