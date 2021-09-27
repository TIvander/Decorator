public abstract class ApartamentoDecorator implements  Iespaco{
    private Iespaco espaco;
    public String estrutura;

    public ApartamentoDecorator(Iespaco espaco) {
        this.espaco = espaco;
    }

    public Iespaco getEspaco(){
        return espaco;
    }
    public void setEspaco(Iespaco espaco) {
        this.espaco = espaco;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
