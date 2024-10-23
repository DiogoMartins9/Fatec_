/**
 *  Crie uma classe em Java chamada Data que inclui três informações como
 *  variáveis de instância: 
 *      • mês (int), 
 *      • dia (int), 
 *      • e ano (int).
 * 
 *  A classe deve ter métodos get e set para cada variável e um construtor que 
 *  inicializa as variáveis e assume que os valores fornecidos são corretos. Forneça 
 *  um método displayData que exibe o dia, o mês e o ano separados por barras 
 *  normais ( / ).
 *  
 *  Escreva um aplicativo de teste chamado DataTeste que demonstra as capacidades da classe Data.
 */

package ex4;

/**
 * @author 
 */

public class Data {
    int dia;
    int mes;
    int ano;
    
    public Data(int dd, int mm, int aaaa) {
        dia = dd;
        mes = mm;
        ano = aaaa;        
    }
    
    // Dia
    public void setDia(int dd) {
        dia = dd;
    }
    
    public int getDia() {
        return dia;
    }
    
    // Mês
    public void setMes(int mm) {
        mes = mm;
    }
    
    public int getMes() {
        return mes;
    }
    
    // Ano
    public void setAno(int aaaa) {
        ano = aaaa;
    }
    
    public int getAno() {
        return ano;
    }
    
    // Método que exibe a data formatada.
    public String displayData() {
        return "" + getDia() + "/" + getMes() + "/" + getAno();
    }
}