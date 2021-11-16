package com.ccenyo.thispersondoesnotexist;

import com.ccenyo.thispersondoesnotexist.service.ImageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ThispersondoesnotexistApplicationTests {

	@Autowired
	public ImageService imageService;

	@Test
	void testImage() throws Exception {
		byte[] newImage = imageService.getNewImage();
	}
}
