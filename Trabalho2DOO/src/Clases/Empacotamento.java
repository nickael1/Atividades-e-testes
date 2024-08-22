  
/*package Clases;

    import java.io.File;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.io.FileInputStream;
    import java.io.FileOutputStream;
    import java.io.ObjectInputStream;
    import java.io.ObjectOutputStream;

/**
 *
 * @author nicka
 */
/*public class Empacotamento {
    // serialização: gravando o objetos no arquivo binário "nomeArq"
    public static void gravarArquivoBinario(ArrayList lista, String nomeArq) {
      File arq = new File(nomeArq);
      try {
        arq.delete();
        arq.createNewFile();

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
        objOutput.writeObject(lista);
        objOutput.close();

      } catch(IOException erro) {
          System.out.printf("Erro: %s", erro.getMessage());
      }
    }

    // desserialização: recuperando os objetos gravados no arquivo binário "nomeArq"
    public static ArrayList<Object> lerArquivoBinario(ArrayList lista, String nomeArq, int n) {
        
        
      try {
        File arq = new File(nomeArq);
        if (arq.exists()) {
           ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
            //lista = (ArrayList<Usuario>)objInput.readObject();
            if (n == 1) {
                lista = (ArrayList<DespesasMultasClasse>)objInput.readObject();
           
            }else if (n ==2) {
                lista = (ArrayList<Veiculo>)objInput.readObject();
            }
            objInput.close();
        }
      } catch(IOException erro1) {
          System.out.printf("Erro: %s", erro1.getMessage());
      } catch(ClassNotFoundException erro2) {
          System.out.printf("Erro: %s", erro2.getMessage());
      }

      return(lista);
    }
}
*/

package Clases;

import java.io.*;
import java.util.ArrayList;

public class Empacotamento {

    // serialização: gravando os objetos no arquivo binário "nomeArq"
    public static <T> void gravarArquivoBinario(ArrayList<T> lista, String nomeArq) {
        File arq = new File(nomeArq);
        try {
            if (arq.exists()) {
                //arq.delete(); // Apaga o arquivo anterior, caso exista
            }
            arq.createNewFile();

            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
            objOutput.writeObject(lista);
            objOutput.close();

        } catch (IOException erro) {
            erro.printStackTrace(); // Mostra mais detalhes do erro
        }
    }

    // desserialização: recuperando os objetos gravados no arquivo binário "nomeArq"
    public static <T> ArrayList<T> lerArquivoBinario(String nomeArq) {
        ArrayList<T> lista = new ArrayList<>();
        File arq = new File(nomeArq);

        try {
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                lista = (ArrayList<T>) objInput.readObject();
                objInput.close();
            }
        } catch (IOException | ClassNotFoundException erro) {
            erro.printStackTrace(); // Mostra mais detalhes do erro
        }

        return lista;
    }
}
