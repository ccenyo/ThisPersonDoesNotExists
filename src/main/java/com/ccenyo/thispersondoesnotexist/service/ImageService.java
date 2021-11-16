package com.ccenyo.thispersondoesnotexist.service;

import net.dongliu.requests.RequestBuilder;
import net.dongliu.requests.Requests;
import org.springframework.stereotype.Service;


@Service
public class ImageService {
    public String IMAGE_ENDPOINT = "https://thispersondoesnotexist.com/image";

    public byte[] getNewImage() throws Exception {
        RequestBuilder request = Requests.newRequest("GET", IMAGE_ENDPOINT);
        var response = request.send();
        if(response.statusCode() == 200) {
            return response.readToBytes();
        }
        throw new Exception();
    }
}
