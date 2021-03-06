//package so_epiescalonador;

public class BCP {

    private String nome;        //Linha 0 de cada processo � o nome
    private String [] comandos; //Armazenar as refer�ncias das instru��e de cada processo
    private int prioridade;
    private int CP;				//Armazena a posi��o em que parou o 
    private char estadoProcesso; //(e)xecutando, (p)ronto ou (b)loqueado
    private int estadoAtual;
    private int creditos = prioridade;
    private int quantum;
    private int espera;

    public BCP(String nome){
        this.nome = nome;
        comandos = new String[22];
    }
     /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum (int q) {
        this.quantum = q;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos (int c) {
        this.creditos = c;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int p) {
        this.prioridade = p;
    }

    public void setComando (String comandos, int i) {
        this.comandos[i] = comandos;
    }

    public String getComando (int i) {
        return comandos[i];
    }

    /**
     * @return the CP
     */
    public int getCP() {
        return CP;
    }

    /**
     * @param CP the CP to set
     */
    public void setCP(int CP) {
        this.CP = CP;
    }

    /**
     * @return the estadoProcesso
     */
    public char getEstadoProcesso() {
        return estadoProcesso;
    }

    /**
     * @param estadoProcesso the estadoProcesso to set
     */
    public void setEstadoProcesso(char estadoProcesso) {
        this.estadoProcesso = estadoProcesso;
    }

    /**
     * @return the estadoAtual
     */
    public int getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(int estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    
    public int getEspera() {
        return espera;
    }

    public void setEspera(int espera) {
        this.espera = espera;
    }

}
