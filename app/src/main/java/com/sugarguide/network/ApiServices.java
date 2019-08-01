package com.sugarguide.network;

/* Tanggal : 29 Juli 2019
   Nama    : Agung Nugraha
   Nim     : 10116412
   Kelas   : AKB9-IF9 2016
*/

import retrofit2.Call;
import retrofit2.http.GET;
import com.sugarguide.response.ResponseBerita;


public interface ApiServices {

    //@TIPEMETHOD("API_END_POINT")
    @GET("news.php")
    Call<ResponseBerita> request_show_all_berita();
    // <ModelData> nama_method()

}