package CovidSimulator;

import java.util.UUID;

public class Person {
    private UUID id;
    private float temperature;
    private int eta;
    private boolean gusto;
    private boolean tosse;
    private boolean debolezza;
    private SituaClinica condizione;

    public Person(UUID id, float temperature, int eta, boolean gusto, boolean tosse, boolean debolezza, SituaClinica condizione) {
        this.id = id;
        this.temperature = temperature;
        this.eta = eta;
        this.gusto = gusto;
        this.tosse = tosse;
        this.debolezza = debolezza;
        this.condizione = condizione;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public boolean isGusto() {
        return gusto;
    }

    public void setGusto(boolean gusto) {
        this.gusto = gusto;
    }

    public boolean isTosse() {
        return tosse;
    }

    public void setTosse(boolean tosse) {
        this.tosse = tosse;
    }

    public boolean isDebolezza() {
        return debolezza;
    }

    public void setDebolezza(boolean debolezza) {
        this.debolezza = debolezza;
    }

    public SituaClinica getCondizione() {
        return condizione;
    }

    public void setCondizione(SituaClinica condizione) {
        this.condizione = condizione;
    }

    public enum SituaClinica {
        SOTTOCONTROLLO,CAUTELA,CRITICA
    }
}
