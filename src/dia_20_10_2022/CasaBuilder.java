package dia_20_10_2022;

public class CasaBuilder {
    private Casa casa = new Casa();

    public  CasaBuilder comChurrasqueira(){
        this.casa.setIsComChurrasqueira(true);
        return this;
    }

    public  CasaBuilder comJardim(){
        this.casa.setIsComJardim(true);
        return this;
    }

    public  CasaBuilder comPiscina(){
        this.casa.setIsComPiscina(true);
        return this;
    }
    public  Casa builder(){
        return this.casa;
    }

}
