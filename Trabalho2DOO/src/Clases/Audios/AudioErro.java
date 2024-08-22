package Clases.Audios;
import java.io.File;
import javax.sound.sampled.*;
/**
 *
 * @author nicka
 */
public class AudioErro {
    public void AudioErro() { //Método AudioErro.
        try {
            //URL do som, o local aonde está armazenado, para funcionar copie o endereço do arquivo de audio que está na pasta "audios" dentro do Trabalho2DOO\\audios\\audioErroWXP.wav!
            //AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E:\\nickael 3 fase\\Orientação a Objetos\\Trabalho2DOO\\audios\\audioErroWXP.wav").getAbsoluteFile());
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("audios\\audioErroWXP.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            //clip.loop(Clip.LOOP_CONTINUOUSLY); //Para repetir o som.
            
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }
    
}
