package dia_20_10_2022;

public class Main {

    public static void main(String[] args){
        Casa casa1 = new CasaBuilder().builder();
        Casa casa2 = new CasaBuilder().comPiscina().builder();
        Casa casa3 = new CasaBuilder().comChurrasqueira().builder();
        Casa casa4 = new CasaBuilder().comJardim().builder();
        Casa casa5 = new CasaBuilder().comChurrasqueira().comJardim().comPiscina().builder();

        System.out.println(casa1);
        System.out.println(casa2);
        System.out.println(casa3);
        System.out.println(casa4);
        System.out.println(casa5);
    }
}
