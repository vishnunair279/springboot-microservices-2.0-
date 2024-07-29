package com.vishnu.accounts.service.client;

import com.vishnu.accounts.dto.CardsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cards")
public interface CardsFeignClient {

    @GetMapping("/api/fetch")
     ResponseEntity<CardsDto> fetchCardDetails(@RequestParam String mobileNumber);
}
