package org.conversor;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

public class ExchangeRateAPIManager {

    public double getExchangeRate(String fromCurrency, String toCurrency) throws IOException {
        String apiKey = "ddf345a2d36daffa8552a867";
        String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + fromCurrency;
        URL url = new URL(urlStr);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonObject root = jp.parse(new InputStreamReader((InputStream) request.getContent())).getAsJsonObject();
        JsonObject conversionRates = root.getAsJsonObject("conversion_rates");
        return conversionRates.get(toCurrency).getAsDouble();
    }
}
