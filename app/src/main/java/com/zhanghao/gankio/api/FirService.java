package com.zhanghao.gankio.api;

import com.zhanghao.gankio.entity.AppInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by zhanghao on 2017/5/9.
 */

public interface FirService {

    @GET("apps/latest/?api_token=")
    Call<AppInfo> getAppBuildInfo();


    @GET
    @Streaming
    Call<ResponseBody> downloadNewApk(@Url String url);

}
