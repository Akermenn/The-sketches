package com.example.sstatsmatches.network;

import retrofit2.Retrofit;

public final class SStatsService {

    private static final String DEFAULT_BASE_URL = "https://api.sstats.net/";

    private static SStatsApi api;

    private SStatsService() {
    }

    public static SStatsApi api() {
        return api(DEFAULT_BASE_URL);
    }

    public static SStatsApi api(String baseUrl) {
        if (api != null) {
            return api;
        }

        Retrofit retrofit = ApiClient.getRetrofit(baseUrl);
        api = retrofit.create(SStatsApi.class);
        return api;
    }
}


/app/src/main/java/com/example/sstatsmatches/network/SStatsService.java