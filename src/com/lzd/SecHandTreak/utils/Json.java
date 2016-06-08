package com.lzd.SecHandTreak.utils;

/**
 * Created by lzd-develop on 16-5-4.
 */
import java.lang.reflect.Type;

public abstract class Json {
    private static Json json;

    public Json() {
    }

    public static Json set(Json json) {
        json = json;
        return json;
    }

    public static Json setDefault() {
        json = new GsonImpl();
        return json;
    }

    public static Json get() {
        if(json == null) {
            json = new GsonImpl();
        }

        return json;
    }

    public abstract String toJson(Object var1);

    public abstract <T> T toObject(String var1, Class<T> var2);

    public abstract <T> T toObject(String var1, Type var2);

    public abstract <T> T toObject(byte[] var1, Class<T> var2);
}