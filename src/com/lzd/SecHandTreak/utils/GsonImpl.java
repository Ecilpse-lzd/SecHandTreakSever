package com.lzd.SecHandTreak.utils;

/**
 * Created by lzd-develop on 16-5-4.
 */
import com.google.gson.Gson;
import java.lang.reflect.Type;

public class GsonImpl extends Json {
    private Gson gson = new Gson();

    public GsonImpl() {
    }

    public String toJson(Object src) {
        return this.gson.toJson(src);
    }

    public <T> T toObject(String json, Class<T> claxx) {
        return this.gson.fromJson(json, claxx);
    }

    public <T> T toObject(String json, Type type) {
        return this.gson.fromJson(json, type);
    }

    public <T> T toObject(byte[] bytes, Class<T> claxx) {
        return this.gson.fromJson(new String(bytes), claxx);
    }
}