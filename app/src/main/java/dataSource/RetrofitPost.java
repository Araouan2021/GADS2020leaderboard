package dataSource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitPost {
    private static Retrofit retrofit = null;
    private static final String BASE_URL_GIT = "https://docs.google.com/forms/d/e/";

    public static Retrofit getRetrofitGitHub() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL_GIT)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
