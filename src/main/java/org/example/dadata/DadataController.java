package org.example.dadata;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev/api/dadata")
@RequiredArgsConstructor
public class DadataController {

    private final DadataFeignClient dadataFeignClient;

    @PostMapping
    public DadataResponse createUser(@RequestBody DadataRequest dadataRequest) throws Exception {
        try {
            return dadataFeignClient.getUnit("Token 8654851ed959e93137a3bd7d6fb2c78b00879996", dadataRequest);
        } catch (Exception e){
            throw new Exception(e);
        }
    }
}
