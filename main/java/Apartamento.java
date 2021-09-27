public class Apartamento implements Iespaco{
    public int quartos;
    public int banheiros;

    public Apartamento() {

    }

    public Apartamento(int quartos, int banheiros) {
        this.banheiros = banheiros;
        this.quartos = quartos;
    }

    public int getQuartos() {
        return quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }
    public Iespaco getEspaco(){
        return "Apartamento";
    }

}
