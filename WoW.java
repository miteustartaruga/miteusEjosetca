import java.util.Random;

public class WoW {

    // Move o cursor para uma posição do terminal. O próximo
    // System.out.print vai escrever a partir dessa posição.
    //
    // Exemplo:
    //   irPara(5, 10);             // linha 5, coluna 10
    //   System.out.print("Oi!");   // escreve "Oi!" nessa posição
    //
    // ATENÇÃO:
    //   - Primeiro vem a LINHA (para baixo), depois a COLUNA (para o lado).
    //   - O terminal começa a contar em 1, e NÃO em 0 como os arrays do Java.
    //     O canto de cima à esquerda é irPara(1, 1).
    //   - Rode no terminal (VS Code, Windows Terminal, terminal do Mac/Linux).
    //     No console do Eclipse ou NetBeans não funciona e aparecem
    //     caracteres estranhos.
    public static void irPara(int linha, int coluna) {
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df", escCode, linha, coluna));
    }

    // Escreve um texto numa posição do terminal. É o mesmo que chamar
    // irPara e depois System.out.print, só que numa linha só.
    //
    // Exemplo:
    //   escreverEm(1, 1, "Pontos: 10");    // placar no canto de cima
    //   escreverEm(5, 20, "@");            // personagem na linha 5, coluna 20
    //
    // Lembre: o terminal começa a contar em 1 (veja o irPara).
    public static void escreverEm(int linha, int coluna, String texto) {
        irPara(linha, coluna);
        System.out.print(texto);
    }

    // Apaga tudo o que está escrito no terminal e volta o cursor
    // para o canto de cima à esquerda, a posição irPara(1, 1).
    //
    // Exemplo:
    //   limparTela();
    //
    // Assim como o irPara, só funciona rodando no terminal.
    public static void limparTela() {
        System.out.print("\033[2J"); // apaga a tela
        System.out.print("\033[H");  // volta o cursor para o canto (1, 1)
        System.out.flush();          // garante que os comandos acima sejam enviados agora
    }

    // Pausa o programa por um tempo.
    // O tempo é em milissegundos: 1000 milissegundos = 1 segundo.
    // Exemplos:
    //   esperar(1000); // espera 1 segundo
    //   esperar(500);  // espera meio segundo
    public static void esperar(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            // não faz nada: se a espera for interrompida, o programa só continua
        }
    }

    // Constantes das cores básicas, para usar com mudarCor e mudarCorFundo.
    // Assim dá para escrever mudarCor(VERDE) em vez de mudarCor(2).
    // "final" quer dizer que o valor nunca muda.
    public static final int PRETO      = 0;
    public static final int VERMELHO   = 1;
    public static final int VERDE      = 2;
    public static final int AMARELO    = 3;
    public static final int AZUL       = 4;
    public static final int MAGENTA    = 5;
    public static final int CIANO      = 6;
    public static final int CINZA      = 7;
    public static final int BRANCO     = 15;
    public static final int COR_PADRAO = -1; // a cor original do terminal

    // Muda a cor do TEXTO. Tudo o que for escrito depois sai nessa cor.
    //
    // A cor é um número de 0 a 255 (são 256 cores!). Para as cores
    // básicas, use as constantes acima. Para ver todas as 256 cores e
    // escolher o número, chame a função mostrarCores().
    // Use COR_PADRAO (-1) para voltar à cor original do terminal.
    //
    // Exemplo:
    //   mudarCor(VERDE);                  // texto verde
    //   System.out.println("Você venceu!");
    //   mudarCor(208);                    // texto laranja (uma das 256 cores)
    //   System.out.println("Cuidado!");
    //   mudarCor(COR_PADRAO);             // volta ao normal
    //
    // ATENÇÃO:
    //   - Use mudarCor(COR_PADRAO) no fim do programa para o terminal não ficar colorido.
    //   - Cuidado com texto preto em terminal escuro (ou branco em terminal claro):
    //     ele fica invisível!
    //   - Só funciona rodando no terminal.
    public static void mudarCor(int cor) {
        if (cor >= 0 && cor <= 255) {
            System.out.print("\033[38;5;" + cor + "m");
        } else {
            System.out.print("\033[39m"); // cor padrão do terminal
        }
    }

    // Muda a cor do FUNDO (atrás das letras). Usa as mesmas cores
    // do mudarCor: constantes ou números de 0 a 255.
    //
    // Exemplo:
    //   mudarCorFundo(AZUL);              // fundo azul
    //   mudarCor(AMARELO);                // texto amarelo
    //   System.out.print(" PLACAR: 10 ");
    //   mudarCorFundo(COR_PADRAO);        // volta o fundo ao normal
    //   mudarCor(COR_PADRAO);             // volta o texto ao normal
    //
    // Dica: escreva espaços " " com a cor de fundo para desenhar blocos coloridos.
    public static void mudarCorFundo(int cor) {
        if (cor >= 0 && cor <= 255) {
            System.out.print("\033[48;5;" + cor + "m");
        } else {
            System.out.print("\033[49m"); // cor padrão do terminal
        }
    }

    // Mostra na tela as 256 cores, cada número escrito na sua cor.
    // Use para escolher o número da cor que você quer no seu jogo.
    //   0 a 15    : cores básicas
    //   16 a 231  : cores variadas
    //   232 a 255 : tons de cinza, do mais escuro ao mais claro
    public static void mostrarCores() {
        System.out.println("Cores de 0 a 255:");
        for (int i = 0; i < 256; i++) {
            mudarCor(i);
            System.out.printf("Cor %-3d ", i);
            if (i % 8 == 7) {
                System.out.println(); // pula a linha a cada 8 cores
            }
        }
        mudarCor(COR_PADRAO);
    }

    public static void asciiArt() {

        // vejam em https://www.asciiart.eu


        limparTela();
        System.out.println("  Bom dia Senhores!");
        System.out.println("                  {}");
        System.out.println("  ,   A           {}");
        System.out.println(" / \\, | ,        .--.");
        System.out.println("|  =|= >        /.--.\\");
        System.out.println(" \\ /` | `       |====|");
        System.out.println("  `   |         |`::`|");
        System.out.println("      |     .-;`\\..../`;_.-^-._");
        System.out.println("     /\\\\/  /  |...::..|`   :   `|");
        System.out.println("     |:'\\ |   /'''::''|   .:.   |");
        System.out.println("      \\ /\\;-,/\\   ::  |..ASCII..|");
        System.out.println("      |\\ <` >  >._::_.| ':ART:' |");
        System.out.println("      | ``_/  |^^/>/> |   ':'   |");
        System.out.println("      |       |       \\    :    /");
        System.out.println("      |       |        \\   :   /");
        System.out.println("      |       |___/\\___|`-.:.-`");
        System.out.println("      |        \\_ || _/    `");
        System.out.println("      |        <_ >< _>");
        System.out.println("      |        |  ||  |");
        System.out.println("      |        |  ||  |");
        System.out.println("      |       _\\.:||:./_");
        System.out.println("      |      /____/\\____\\");
        System.out.println("");
        System.out.println(".:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:\n");
    }

    public static void printIF() {

        System.out.println("          .:**##**+.    .:::----=:-::.  ..-:::--::::::.    ");
        System.out.println("        .+###########. +**************-.+*************+.   ");
        System.out.println("       -##############==**************-:**************+:   ");
        System.out.println("      .################-**************-:**************+:   ");
        System.out.println("      :################***************-:**************+:   ");
        System.out.println("      :################+**************-:**************+:   ");
        System.out.println("      .*###############-**************-:**************+:   ");
        System.out.println("       .*#############:+**************-:**************+:   ");
        System.out.println("         .*########*-   -++++++++++++=  .=+++++++++++-:    ");
        System.out.println("       .====+=+++=+===  -=============.                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.:+*************-                    ");
        System.out.println("        .===========:    ::-======-=::                     ");
        System.out.println("       :*************=..+************+. =*************-.   ");
        System.out.println("       +**************.+**************-:**************+:   ");
        System.out.println("       +**************.=**************-:**************+:   ");
        System.out.println("       +**************.=**************-:**************+:   ");
        System.out.println("       +**************.=**************-:**************+:   ");
        System.out.println("       +**************.=**************-:**************+:   ");
        System.out.println("       +**************.=**************-:**************+:   ");
        System.out.println("       -*************=.:+************+- +*************=.   ");
        System.out.println("        .::::::::::::    :::::::::::::                     ");
        System.out.println("       +**************.=+*************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       =**************.***************-                    ");
        System.out.println("       .*++++++++++++= .=++++++++++++=.                    ");
    }

    public static void printBart() {

        // https://www.asciiart.eu/cartoons/simpsons

        System.out.println("                                  ");
        System.out.println("          , ,\\ ,'\\,'\\ ,'\\ ,\\ ,    ");
        System.out.println("    ,  ;\\/ \' `'     `   '  /|    ");
        System.out.println("    |\\/                      |    ");
        System.out.println("    :                        |    ");
        System.out.println("    :                        |    ");
        System.out.println("     |                       |    ");
        System.out.println("     |                       |    ");
        System.out.println("     :               -.     _|    ");
        System.out.println("      :                \\     `.   ");
        System.out.println("      |         ________:______\\  ");
        System.out.println("      :       ,'o       / o    ;  ");
        System.out.println("      :       \\       ,'-----./   ");
        System.out.println("       \\_      `--.--'        )   ");
        System.out.println("      ,` `.              ,---'|   ");
        System.out.println("      : `                     |   ");
        System.out.println("       `,-'                   |   ");
        System.out.println("       /      ,---.          ,'   ");
        System.out.println("    ,-'            `-,------'     ");
        System.out.println("   '   `.        ,--'             ");
        System.out.println("         `-.____/                 ");
        System.out.println("                \\                 ");
    }

    

    public static void main(String[] args) {
        int linha, coluna, cor;
        int TAM_LINHA = 30;
        int TAM_COLUMA = 160;
        int NUM_CORES = 8;

        // gerador de numeros aleatorios
        Random gerador = new Random();

        limparTela();

        // laço de repetição
        for (int i = 0; i < 10000; i++) {

            // linha, coluna e cor aleatória
            linha = gerador.nextInt(TAM_LINHA)  + 1;  // o terminal começa em 1
            coluna = gerador.nextInt(TAM_COLUMA)+ 1;
            cor = gerador.nextInt(NUM_CORES);
            // vai para a posição desejada
            irPara(linha, coluna);
            // escolhe a cor
            mudarCor(cor);
            // System.out.print("oi");
            System.out.print((char) (gerador.nextInt(26) + 'A'));
            esperar(1);

        }

        asciiArt();

       
        esperar(1000); // espera 1000 milissegundos -> 1 segundo
        mudarCor(VERDE);
        mudarCorFundo(VERMELHO);
        printIF();
        esperar(1000); // espera 1000 milissegundos -> 1 segundo
        mudarCor(AMARELO);
        mudarCorFundo(COR_PADRAO);
        printBart();
        
        mudarCor(COR_PADRAO); // volta para a cor padrão do terminal

        esperar(1000);
        System.out.println();
        mostrarCores(); // mostra as 256 cores para escolher
    }
}
