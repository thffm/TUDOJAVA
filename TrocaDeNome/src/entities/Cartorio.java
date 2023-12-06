package entities;

public class Cartorio {
    private String name;
    private long cpf;
    private String estadoCivil;

    public  Cartorio(String name,long cpf, String estadoCivil){
        this.name = name;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public long getCpf(){
        return cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    public String toString() {
        return String.format("Nome:%S \nCpf:%d\nEstado civil:%S",name,cpf,estadoCivil);
    }


}
