package com.ccenyo.thispersondoesnotexist.controller;

import com.ccenyo.thispersondoesnotexist.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @Autowired
    public ImageService imageService;

    @GetMapping(value = "/generate", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] generateNewImage() throws Exception {
        return this.imageService.getNewImage();
    }
}
