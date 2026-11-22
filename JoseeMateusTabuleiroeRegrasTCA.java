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

//Aqui vão ficar os métodos que serão ativados dentro do método main:

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
                
                if (j < 8 && PAREDESVERTICAIS[i][j]) {

                    System.out.print("#");
                } else {

                    System.out.print("|");
                }
            }   
            System.out.println();  
                
            System.out.print("   +");
            for (int j = 0; j < 9; j++) {
                if (i < 8 && PAREDESHORIZONTAIS[i][j]) {
                    
                    System.out.print("===+");
                } else {

                    System.out.print("---+");
                }
            }
            System.out.println();
        }
        System.out.println("Aperte 'G' para utilizar o modo de posicionar parede.");
    }


//A partir daqui fica o método main, basicamente o principal que sustenta o programa:

    public static void main (String[]args) {
        
        TABULEIRO [ControleTeclasJogoComJNA.posYJogador1] [ControleTeclasJogoComJNA.posXJogador1] = 1;
        TABULEIRO [ControleTeclasJogoComJNA.posYJogador2] [ControleTeclasJogoComJNA.posXJogador2] = 2;
        boolean turnojogador1 = true;

        while (true) {    
            
            ControleTeclasJogoComJNA.limparConsole();
            InterfaceTCABar.imprimirInterface();
            if (InterfaceTCABar.cenacreditos) {

                InterfaceTCABar.exibirCreditos();
            }
            while (true) {
                
                if (InterfaceTCABar.comecar1x1) {
                        
                    if (verificarSeExisteVencedor() == true) {
                        
                        break;
                    } else {
                        
                        ControleTeclasJogoComJNA.verificarMovimentacaoJogador1();
                        if(ControleTeclasJogoComJNA.redesenhar) {

                            ControleTeclasJogoComJNA.limparConsole();
                            imprimirTabuleiro();
                            ControleTeclasJogoComJNA.redesenhar = false;
                        }
                        
                        ControleTeclasJogoComJNA.esperar(100);
                        
                        ControleTeclasJogoComJNA.verificarMovimentacaoJogador2();
                        if(ControleTeclasJogoComJNA.redesenhar) {

                            ControleTeclasJogoComJNA.limparConsole();
                            imprimirTabuleiro();
                            ControleTeclasJogoComJNA.redesenhar = false;
                        }

                        ControleTeclasJogoComJNA.esperar(100);
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
        } else if (BarreirasJogador2 >= 1) {

            verificarMovimentacaoDasParedes(); 
        } else {

            System.out.println("Sinto muito, suas barreiras acabaram!");
        }
        
    }

    public static void verificarMovimentacaoDasParedes() {

        boolean paredeHorizontal = true;
        System.out.println("Para escolher o tipo de parede a ser selecionada, digite 1 (Horizonal) ou 0 (Vertical) ");
        int parede = ControleTeclasJogoComJNA.obtemTeclaPressionada();
        switch (parede) {
            case 48:
                paredeHorizontal = false;
                break;
            case 49:
                paredeHorizontal = true;
                break;
        }
        if (paredeHorizontal) {

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
                        System.out.println("Por favor, digite um caractere válido.");
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
                        System.out.println("Por favor, digite um número válido.");
                        break;
                }
                
                if ((posicaoX < 73 && posicaoX > 65) || (posicaoX < 106 && posicaoX > 96) && posicaoY < 58 && posicaoY > 47) {

                    PAREDESHORIZONTAIS [casacorretaY][casacorretaX] = true;
                    ControleTeclasJogoComJNA.limparConsole();
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
                        System.out.println("Por favor, digite um caractere válido.");
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
                        System.out.println("Por favor, digite um caractere válido.");
                        break;
                }
            
                if ((posicaoX < 73 && posicaoX > 65) || (posicaoX < 106 && posicaoX > 96) && posicaoY < 58 && posicaoY > 47) {

                    PAREDESVERTICAIS [casacorretaY][casacorretaX] = true;
                    ControleTeclasJogoComJNA.limparConsole();
                    imprimirTabuleiro();
                }
                break;
            }
        
        }  
    
    }
}