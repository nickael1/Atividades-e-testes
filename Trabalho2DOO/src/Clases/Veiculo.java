
package Clases;
import java.util.ArrayList;
/**
 *
 * @author alunolages
 */
public class Veiculo {
    //Dados do veiculo
    String marcaDoVeiculo, modelo, ano, motorizacao, cor, placa, tipoDoVeiculo;
    String kilometragem;
    //manutensao do veiculo
    //float kmTrocaOleo, kmFiltroOleo, kmFiltroDeAr, kmFiltroArCond, kmFiltroCombustivel, kmCorreiaDentada;
    //String dataTrocaOleo, dataFiltroOleo, dataFiltroDeAr, dataFiltroArCond, dataFiltroCombustivel, dataCorreiaDentada;

    public Veiculo(String marcaDoVeiculo, String modelo, String ano, String motorizacao, String cor, String placa, String tipoDoVeiculo, String kilometragem) {
        this.marcaDoVeiculo = marcaDoVeiculo;
        this.modelo = modelo;
        this.ano = ano;
        this.motorizacao = motorizacao;
        this.cor = cor;
        this.placa = placa;
        this.tipoDoVeiculo = tipoDoVeiculo;
        this.kilometragem = kilometragem;
    }
    

    public String getMarcaDoVeiculo() {
        return marcaDoVeiculo;
    }

    public void setMarcaDoVeiculo(String marcaDoVeiculo) {
        this.marcaDoVeiculo = marcaDoVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(String motorizacao) {
        this.motorizacao = motorizacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoDoVeiculo() {
        return tipoDoVeiculo;
    }

    public void setTipoDoVeiculo(String tipoDoVeiculo) {
        this.tipoDoVeiculo = tipoDoVeiculo;
    }
    
    public String getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(String kilometragem) {
        this.kilometragem = kilometragem;
    }
    
    
    //Cadastro da manutencao

    @Override
    public String toString() {
        return "Veiculo{" + "marcaDoVeiculo=" + marcaDoVeiculo + ", modelo=" + modelo + ", ano=" + ano + ", motorizacao=" + motorizacao + ", cor=" + cor + ", placa=" + placa + ", tipoDoVeiculo=" + tipoDoVeiculo + ", kilometragem=" + kilometragem + '}';
    }
    

    

    

    
    
    

    

    
    
    
    
    
    
}
