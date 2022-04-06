package web.model;
import java.util.Objects;

public class Car {
    private String creator;
    private String series;
    private int date;

    public Car() {
    }

    public Car(String creator, String series, int date) {
        this.creator = creator;
        this.series = series;
        this.date = date;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {

        return "Car{" +
                "creator='" + creator + '\'' +
                ", series='" + series + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return  Objects.equals(creator, car.creator) &&
                Objects.equals(series, car.series) &&
                Objects.equals(date, car.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator, series, date);
    }
}
