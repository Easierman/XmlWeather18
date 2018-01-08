package com.example.administrator.xmlweather18;

/**
 * Created by Administrator on 2018/1/2.
 */

public class WeatherInf {
    String date;
    String high;
    String low;
    KK day;
    KK night;
}
class KK{
    String type;
    String fengxiang;
    String fengli;
    public String inf(){
        String str = type + "风向：" + fengxiang + "风力：" + fengli;
        return str;
    }
}
