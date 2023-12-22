package org.example.dadata;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "dadata", url = "http://suggestions.dadata.ru/suggestions/api/4_1/rs", configuration = FeignConfiguration.class)
public interface DadataFeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "/suggest/fms_unit", consumes = {MediaType.APPLICATION_JSON_VALUE})
    DadataResponse getUnit(@RequestHeader("Authorization") String token, @RequestBody DadataRequest request);
}
