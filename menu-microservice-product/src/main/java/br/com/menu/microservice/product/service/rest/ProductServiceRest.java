package br.com.menu.microservice.product.service.rest;

import br.com.menu.microservice.product.dto.ProductTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceRest {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${product.type.rest.url}")
    private String urlRest;

    public ProductTypeDto getProductType(final Long id) {
        String url = urlRest + "/find/" + id;
        return restTemplate. getForObject(url.trim(), ProductTypeDto.class);
    }
}
