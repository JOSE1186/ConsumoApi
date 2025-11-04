package modelo;

public class Coordenadas {

    private String cidade;
    private String estado;
    private String pais;
    private double latitude;
    private double longitude;




    public Coordenadas(String cidade, String estado, String pais, double latitude, double longitude) {
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters e Setters
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "\n------ COORDENADAS ------" +
                "\nCidade: " + cidade +
                "\nEstado: " + estado +
                "\nPaís: " + pais +
                "\nLatitude: " + latitude +
                "\nLongitude: " + longitude;
    }
}
