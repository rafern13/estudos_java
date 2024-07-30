package academy.devdojo.maratonajava.javacore.Ycolecoes.test.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /*
    REGRINHAS:

    -REFLEXIVO: x.equals(x) == true, para tudo que for diferente de null
    -SIMÉTRICO: para x e y != null, se x.equals(y) == true, logo y.equals(x) == true tambem.
    -TRANSITIVIDADE: para x, y, z != null, se x.equals(y) == true, e y.equals(z) == true, entao x.equals(z) == true da mesma forma
    -CONSISTENTE: x.equals(x) sempre retorna true se x != null
    -para x != null, x.equals(null) tem que retornar false

     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
