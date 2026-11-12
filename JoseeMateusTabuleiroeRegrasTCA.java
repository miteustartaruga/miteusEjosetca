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

    public static boolean lerValorBooleano() {
        boolean booleano = LER.nextBoolean();
        return booleano;
    }

    public static int lerValorInteiro() {
        int numero = LER.nextInt();
        return numero;
    }

    public static char lerLetra() {
        char letra = LER.next().charAt(0);
        return letra;
    }

    public static void imprimirTabuleiro() {
        
        //Essa parte do código aq imprime a legenda
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
                } else if (TABULEIRO[i][j] == 2) {
                    casadeinicio = '2';
                }
                System.out.print(" " + casadeinicio + " ");

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


        while (true) {    
            
            ControleTeclasJogoComJNA.limparConsole();
            InterfaceTCABar.imprimirInterface();
            if (InterfaceTCABar.cenacreditos) {

                InterfaceTCABar.exibirCreditos();
            }
            
            if (InterfaceTCABar.comecar1x1) {

            
            
                ControleTeclasJogoComJNA.esperarTecla();
                while (true) {
                    
                    
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
                }    
                break;
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
                System.out.print(recado);

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

    public static void modoPosicionarParedes() {

        verificarMovimentacaoDasParedes();
    }

    public static void verificarMovimentacaoDasParedes() {

        boolean paredeHorizontal = true;
        System.out.println("Para escolher o tipo de parede a ser selecionada, digite 1 (Horizonal) ou 0 (Vertical) ");
        int parede = ControleTeclasJogoComJNA.obtemTeclaPressionada();
        switch (parede) {
            case 0:
                paredeHorizontal = false;
                break;
            case 1:
                paredeHorizontal = true;
                break;
        }
        if (paredeHorizontal) {

            System.out.println("Digite as coordenadas que você vai posicionar a sua parede.");
            System.out.println("Digite primeiramente dois caracteres, e depois, digite um número.");
            int posicaoX1 = ControleTeclasJogoComJNA.obtemTeclaPressionada();
            int posicaoX2 = ControleTeclasJogoComJNA.obtemTeclaPressionada(); 
            int posicaoY = ControleTeclasJogoComJNA.obtemTeclaPressionada();
            switch(posicaoX1) {

                case 'a':
                case 'A':
               
                    break;
                case 'b':
                case 'B':

                    break;
                case 'c':
                case 'C':

                    break;
                case 'd':
                case 'D':

                    break;
                case 'e':
                case 'E':

                    break;
                case 'f':
                case 'F':

                    break;
                case 'g':
                case 'G':

                    break;
                case 'h':
                case 'H':

                    break;
                case 'i':
                case 'I':

                    break;
                default:
                    System.out.println("Por favor, digite um caractere válido.");
            }  

        } else {

            System.out.println("Digite as coordenadas que você vai posicionar a sua parede.");
            int posicaoX = ControleTeclasJogoComJNA.obtemTeclaPressionada();
            int posicaoY1 = ControleTeclasJogoComJNA.obtemTeclaPressionada();
            int posicaoY2 = ControleTeclasJogoComJNA.obtemTeclaPressionada();
            switch(posicaoX) {

                case 'a':
                case 'A':
               
                    break;
                case 'b':
                case 'B':

                    break;
                case 'c':
                case 'C':

                    break;
                case 'd':
                case 'D':

                    break;
                case 'e':
                case 'E':

                    break;
                case 'f':
                case 'F':

                    break;
                case 'g':
                case 'G':

                    break;
                case 'h':
                case 'H':

                    break;
                case 'i':
                case 'I':

                    break;
                default:
                    System.out.println("Por favor, digite um caractere válido.");
            }
        }  
    
    }
}