
package Clases;

import java.util.ArrayList;
/**
 *
 * @author alunolages
 */
public class Usuario {
    String cpf, nome;
    
    private ArrayList<DespesasMultasClasse> despesasArray;
    private ArrayList<Veiculo> veiculosArray;
    private ArrayList<MediaKmLitros2Classe> mediaKmsArray;

    public Usuario() {
        this.despesasArray = new ArrayList<>();
        this.veiculosArray = new ArrayList<>();
        this.mediaKmsArray = new ArrayList<>();
        
    }
    //despesas
    public ArrayList<DespesasMultasClasse> getDespesas() {
        return despesasArray;
    }

    public void setDespesas(ArrayList<DespesasMultasClasse> despesas) {
        this.despesasArray = despesas;
    }
    
    //////////veiculos
    public ArrayList<Veiculo> getVeiculosArray() {
        return veiculosArray;
    }

    public void setVeiculosArray(ArrayList<Veiculo> veiculosArray) {
        this.veiculosArray = veiculosArray;
    }
    
    //mediaKms

    public ArrayList<MediaKmLitros2Classe> getMediaKmsArray() {
        return mediaKmsArray;
    }

    public void setMediaKmsArray(ArrayList<MediaKmLitros2Classe> mediaKmsArray) {
        this.mediaKmsArray = mediaKmsArray;
    }
    
    
    
    public Usuario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cpf=" + cpf + ", nome=" + nome + ", despesasArray=" + despesasArray + ", veiculosArray=" + veiculosArray + '}';
    }

    
    
    
    
    

    

    
    
    
}
