package com.sugarguide.network;

/* Tanggal : 29 Juli 2019
   Nama    : Agung Nugraha
   Nim     : 10116412
   Kelas   : AKB9-IF9 2016
*/

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class InitRetrofit {
    // URL Server API
    public static String API_URL = "http://agungakb.000webhostapp.com/";

    public static Retrofit setInit() {
        return new Retrofit.Builder().baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiServices getInstance() {
        return setInit().create(ApiServices.class);
    }
}