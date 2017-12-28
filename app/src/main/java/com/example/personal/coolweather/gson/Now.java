package com.example.personal.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jsyl on 2017/12/28.
 */
public class Now {

    @SerializedName("tmp")
    public String tmperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
