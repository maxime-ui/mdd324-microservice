package com.ipiecoles.java.mdd324;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LambdaApp implements RequestHandler<Map<String, Object>, GatewayResponse> {

    @Override
    public GatewayResponse handleRequest(Map<String, Object> stringObjectMap, Context context) {
        Service_Films service_films = new Service_Films();
        String errorMessage = "\"error500\": \"Le serveur à rencontrer une erreur\"";
        String result = null;
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Access-Control-Allow-Origin", "https://pjvilloud.github.io");
        try {
            result = Service_Films.xmlToJson();
        } catch (ParserConfigurationException e) {
            return new GatewayResponse(
                    errorMessage,
                    headers,
                    500
            );
        } catch (IOException e) {
            return new GatewayResponse(
                    errorMessage,
                    headers,
                    500
            );
        } catch (SAXException e) {
            return new GatewayResponse(
                    errorMessage,
                    headers,
                    500
            );
        }
        return new GatewayResponse(
                result,
                headers,
                200
        );
    }
}
