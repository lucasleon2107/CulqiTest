package com.culqi.test.common;

import com.culqi.test.dto.CargoRequest;
import com.culqi.test.dto.CargoResponse;
import com.culqi.test.dto.TokenRequest;
import com.culqi.test.dto.TokenResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lucas on 9/02/2017.
 */
public class APIMethods {
    public static TokenResponse crearToken(TokenRequest tokenRequest) {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", APIAuth.COMERCIO_KEY);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        HttpEntity<TokenRequest> request = new HttpEntity<>(tokenRequest, headers);

        return restTemplate.postForObject("https://api.culqi.com/v2/tokens", request, TokenResponse.class);
    }

    public static CargoResponse crearCargo(CargoRequest cargoRequest) {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", APIAuth.API_KEY);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        HttpEntity<CargoRequest> request = new HttpEntity<>(cargoRequest, headers);

        return restTemplate.postForObject("https://api.culqi.com/v2/charges", request, CargoResponse.class);
    }
}
