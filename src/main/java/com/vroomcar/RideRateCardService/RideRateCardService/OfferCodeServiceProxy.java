package com.vroomcar.RideRateCardService.RideRateCardService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name="offer-service")
public interface OfferCodeServiceProxy {

	 @GetMapping("rateCardWithOffer/offerCode/{offercode}")
	  public RideEstimate rideEstimatecalculation
	    (@PathVariable("offercode") String offercode);
	}

