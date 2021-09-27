public class Terraco extends ApartamentoDecorator{
    public Terraco(Iespaco espaco) {
        super(espaco);
    }

    public Iespaco getEspaco() {
        return "Com Terraço";
    }
}
