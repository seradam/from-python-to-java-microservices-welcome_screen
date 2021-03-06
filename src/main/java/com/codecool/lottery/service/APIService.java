package com.codecool.lottery.service;

import org.apache.http.client.fluent.Request;
import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.utils.StringUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class APIService {

    private static final Logger logger = LoggerFactory.getLogger(APIService.class);
    private static final String API_URL = "https://api.chucknorris.io/jokes";

    private static APIService INSTANCE;

    public static APIService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new APIService();
        }
        return INSTANCE;
    }
}