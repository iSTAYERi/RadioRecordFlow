package xyz.stayer.radiorecordflow.server

import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET

interface IRecordQuery {

    @GET("xml/drumhits_online_v8.txt")
    fun getSongInfoDrumHits(): Single<ResponseBody>

}