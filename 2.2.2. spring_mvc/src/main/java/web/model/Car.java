package web.model;

public class Car {

    private String model;
    private String series;
    private int ageProduction;


    public Car() {
    }

    public Car(String model, String series, int ageProduction) {
        this.model = model;
        this.series = series;
        this.ageProduction = ageProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getAgeProduction() {
        return ageProduction;
    }

    public void setAgeProduction(int ageProduction) {
        this.ageProduction = ageProduction;
    }
}
