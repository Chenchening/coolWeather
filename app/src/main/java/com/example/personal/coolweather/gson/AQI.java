package com.example.personal.coolweather.gson;

/**
 * Created by jsyl on 2017/12/28.
 */
public class AQI {

    public AQICity city;

    public class AQICity{
//        "aqi":"54","qlty":"良","pm25":"38","pm10":"51","no2":"66","so2":"11","co":"1","o3":"24"
        public String aqi;
        public String qlty;
        public String pm25;
        public String pm10;
        public String no2;
        public String so2;
        public String co;
        public String o3;
    }
}
