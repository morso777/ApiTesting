package data.objects;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Main implements Serializable
{

    @SerializedName("temp")
    @Expose
    private double temp;
    @SerializedName("pressure")
    @Expose
    private long pressure;
    @SerializedName("humidity")
    @Expose
    private long humidity;
    @SerializedName("temp_min")
    @Expose
    private double tempMin;
    @SerializedName("temp_max")
    @Expose
    private double tempMax;
    private final static long serialVersionUID = -4917631013972956785L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Main() {
    }

    /**
     *
     * @param tempMax
     * @param temp
     * @param humidity
     * @param pressure
     * @param tempMin
     */
    public Main(double temp, long pressure, long humidity, double tempMin, double tempMax) {
        super();
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Main withTemp(double temp) {
        this.temp = temp;
        return this;
    }

    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }

    public Main withPressure(long pressure) {
        this.pressure = pressure;
        return this;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public Main withHumidity(long humidity) {
        this.humidity = humidity;
        return this;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public Main withTempMin(double tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public Main withTempMax(double tempMax) {
        this.tempMax = tempMax;
        return this;
    }

}

