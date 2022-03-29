package com.ipiecoles.java.mdd324;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

public class LambdaApp implements RequestHandler<Map<String, Object>, GatewayResponse> {
    @Override
    public GatewayResponse handleRequest(Map<String, Object> input, Context context) {
        ServiceFilm FilmService = new ServiceFilm();
        String result = FilmService.getTitle();
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Access-Control-Allow-Origin", "https://pjvilloud.github.io");
        return new GatewayResponse(
                result,
                headers,
                200
        );
    }
}
