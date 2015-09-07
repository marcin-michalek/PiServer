package pl.michalek.marcin.piserver.network;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * SvnMirror
 * Created by Marcin on 2015-07-19.
 */
public abstract class BaseRestTemplate {
    protected static RestTemplate restTemplate;

    static {
        restTemplate = new RestTemplate();
        setHttpConverters(restTemplate);
    }

    public static void setHttpConverters(RestTemplate restTemplate) {
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
    }
}
