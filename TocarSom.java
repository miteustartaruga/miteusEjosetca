import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class TocarSom {
   
    // ===================================================================
    // tocarSom: toca um arquivo de som .wav
    //
    // COMO USAR NO SEU JOGO:
    //   1. Copie esta função inteira para dentro da classe do seu jogo.
    //   2. Copie também os 3 imports do topo deste arquivo:
    //        import javax.sound.sampled.*;
    //        import java.io.File;
    //        import java.io.IOException;
    //   3. Coloque seus arquivos de som numa pasta "sons" do seu projeto.
    //   4. Chame a função passando o caminho do arquivo e se o programa
    //      deve esperar o som terminar:
    //        tocarSom("sons/Cat-Meow.wav", false); // toca e o jogo segue
    //        tocarSom("sons/Cat-Meow.wav", true);  // espera o som acabar
    //
    // ATENÇÃO:
    //   - Use barra normal "/" no caminho (funciona em Windows, Linux e Mac).
    //     Não use "\\".
    //   - O caminho é relativo à pasta de onde o programa é executado
    //     (normalmente a pasta do projeto). Se aparecer "Arquivo de som não
    //     encontrado", confira o nome do arquivo e de onde você está rodando.
    //   - Só funciona com arquivos .wav (mp3 NÃO funciona).
    //   - esperarTerminar = false: o som toca "por trás" e o jogo continua
    //     rodando normalmente. É o que você vai querer na maioria das vezes
    //     (pulo, tiro, batida...). Vários sons podem tocar ao mesmo tempo.
    //   - esperarTerminar = true: o programa PARA até o som acabar. Útil
    //     para momentos em que o jogo deve esperar (ex.: som de game over
    //     antes de fechar o programa).
    //   - Se o main terminar enquanto um som com "false" ainda toca, o
    //     programa fecha e o som é cortado.
    // ===================================================================
    public static void tocarSom(String caminhoArquivoSom, boolean esperarTerminar){
              
        try {
            // Abrindo o arquivo de som
            File soundFile = new File(caminhoArquivoSom);
            if (!soundFile.exists()) {
                System.out.println("Arquivo de som não encontrado: " + caminhoArquivoSom);
                return;
            }

            // Criando um AudioInputStream
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            // Obtendo as informações do formato de áudio
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Criando o Clip e carregando o áudio
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);

            // Tocando o áudio
            // O áudio já foi carregado no Clip, então o arquivo pode ser fechado
            audioStream.close();

            // Quando o som terminar, libera os recursos automaticamente
            audioClip.addLineListener(evento -> {
                if (evento.getType() == LineEvent.Type.STOP) {
                    audioClip.close();
                }
            });

            // Tocando o áudio
            audioClip.start();

            // Se pediu para esperar, segura o programa enquanto o som toca
            if (esperarTerminar) {
                Thread.sleep(audioClip.getMicrosecondLength() / 1000);
            }
        } catch (UnsupportedAudioFileException e) {
            System.err.println("O formato de áudio não é suportado.");
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.err.println("Linha de áudio não disponível.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de áudio.");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("O programa foi interrompido.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // Peguei exemplos de: https://freewavesamples.com/

       
        // Um som de cada vez: cada um espera o anterior terminar
        tocarSom("sons/Ouch-4.wav", true);

        // Sem esperar: o gato e o prato tocam ao mesmo tempo
        tocarSom("sons/Cat-Meow.wav", false);
        tocarSom("sons/Crash-Cymbal-1.wav", true); // true para o main não terminar antes do som acabar

         
    }
}
