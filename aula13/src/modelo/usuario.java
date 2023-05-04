
package modelo;

public class usuario {
    private Long id;
    private String nome;
    private String idade;
    private String aldeia;
    private String status;
    private String observacao;
    private String blood;
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
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

    /**
     * @return the cpf
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade     
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     * @return the email
     */
    public String getAldeia() {
        return aldeia;
    }
    
    /**
     * @param aldeia    
     */
    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public String getStatus() {
        return aldeia;
    }
    /**
     * @param status
     * 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the telefone
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao
     *
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
     public String getBlood() {
        return blood;
    }

    /**
     * @param blood
     *
     */
    public void setBlood(String blood) {
        this.blood = blood;
    }
}


