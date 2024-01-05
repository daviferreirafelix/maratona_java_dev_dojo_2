package com.Ycolecao.dominio;

public class Celular {
    private String serialNumber;
    private String marca;

    public Celular(String serialNumber, String marca){
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Implementação do método equals deverá ser sempre:

    // Reflexivo: x.equals(x) sempre deve retornar true
    // Simetrico: se x.equals(y) for true, então y.equals(x) também é true
    // Quando x for diferente de null, x.equals(null) retornara null
    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        else if (this == obj) return true;
        else if (this.getClass() != obj.getClass()) return false;

        Celular cel = (Celular) obj;
        return this.serialNumber != null && this.serialNumber.equals(cel.getSerialNumber());
    }

    // o atributo de comparação utilizado no hashCode deve ser o mesmo do equals
    // se x.equals(y) == y.equals(x), então x.hashCode() == y.hashCode()
    // se x.hashCode() == y.hashCode, não é necessario x.equals(y) == y.equals(x)
    // se x.hashCode() != y.hashCode, logo x.equals(y) == false;
    @Override
    public int hashCode(){
        return this.serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Celular{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
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
