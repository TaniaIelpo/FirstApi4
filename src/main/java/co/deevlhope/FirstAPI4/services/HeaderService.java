package co.deevlhope.FirstAPI4.services;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.net.InetSocketAddress;

/**
 * @author Tania Ielpo
 */

@Service
public class HeaderService {

    public String getInfo(HttpHeaders headers){
        InetSocketAddress host = headers.getHost();
        String url = "http://" + host.getHostName() + ":" + host.getPort();
        return String.format("Base URL = %s", url);
    }
}
