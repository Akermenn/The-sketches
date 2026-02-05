package com.example.sstatsmatches.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SStatsApi {

    @GET("games/list")
    Call<String> getGames(
            @Query("from") String from,
            @Query("to") String to,
            @Query("leagueid") Integer leagueId,
            @Query("teamid") Integer teamId,
            @Query("order") Integer order,
            @Query("apikey") String apiKey
    );
}


s/app/src/main/java/com/example/sstatsmatches/network/SStatsApi.java