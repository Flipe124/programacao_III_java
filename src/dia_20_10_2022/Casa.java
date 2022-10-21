package dia_20_10_2022;

public class Casa {
    private Boolean isComChurrasqueira = false;
    private  Boolean isComJardim = false;
    private  Boolean isComPiscina = false;

    public void setIsComChurrasqueira(Boolean isComChurrasqueira){
        this.isComChurrasqueira = isComChurrasqueira;
    }

    public void setIsComJardim(Boolean IsComJardim){
        this.isComJardim = IsComJardim;
    }

    public void setIsComPiscina(Boolean isComPiscina){
        this.isComPiscina = isComPiscina;
    }

    @Override
    public String toString(){
        String mensagem = "Minha casa";

        if (isComChurrasqueira){
            mensagem += ", com churrasqueira";
        }

        if (isComJardim){
            mensagem += ", com jardim";
        }

        if (isComPiscina){
            mensagem += ", com piscina";
        }

        return mensagem + "!";
    }
}
