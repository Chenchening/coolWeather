package com.example.personal.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jsyl on 2017/12/28.
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public Air air;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }
    public class CarWash {
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }
    public class Air {
        @SerializedName("txt")
        public String info;
    }

}
