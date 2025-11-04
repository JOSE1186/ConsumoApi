package modelo;

public class Clima extends Coordenadas {

    private double temperatura;


    public Clima(Coordenadas coordenadas, double temperatura) {
        super(
                coordenadas.getCidade(),
                coordenadas.getEstado(),
                coordenadas.getPais(),
                coordenadas.getLatitude(),
                coordenadas.getLongitude()
        );
        this.temperatura = temperatura;

    }
    @Override
    public String toString() {
        return super.toString() + "\nTemperatura: " + temperatura + "°C";

    }

    public double gettemperatura() {
        return temperatura;

    }
    public void settemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    }
