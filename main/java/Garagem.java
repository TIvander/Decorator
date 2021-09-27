public class Garagem extends ApartamentoDecorator{
    public Garagem(Iespaco espaco) {
        super(espaco);
    }

    public Iespaco getEspaco() {
        return "Com Garagem";
    }
}
