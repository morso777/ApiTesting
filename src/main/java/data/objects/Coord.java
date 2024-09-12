package data.objects;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Coord implements Serializable
{

    @SerializedName("lon")
    @Expose
    private double lon;
    @SerializedName("lat")
    @Expose
    private double lat;
    private final static long serialVersionUID = 8043189015695025483L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Coord() {
    }

    /**
     *
     * @param lon
     * @param lat
     */
    public Coord(double lon, double lat) {
        super();
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public Coord withLon(double lon) {
        this.lon = lon;
        return this;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public Coord withLat(double lat) {
        this.lat = lat;
        return this;
    }

}

