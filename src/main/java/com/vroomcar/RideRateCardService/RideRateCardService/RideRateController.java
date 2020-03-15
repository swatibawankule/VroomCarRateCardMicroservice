package com.vroomcar.RideRateCardService.RideRateCardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * RideController is serving the purpose of Servlet here.
 * @author swatibawankule
 *
 */

@RestController
public class RideRateController {

   
	  @Autowired
	  private OfferCodeServiceProxy proxy;
	
	  /**
	   * Method to find rate by source and destination : KANCHAN
	   * 
	   * */
	  
	@GetMapping(value ="/Ratecard/src/{src}/dest/{dest}/offerCode/{offerCode}", produces= { MediaType.APPLICATION_JSON_VALUE })
	public RideEstimate findRateBySourceDestAndOfferCode( @PathVariable("src") String src, @PathVariable("dest") String dest ,@PathVariable("offerCode") String offerCode) throws Exception{
		
		//calculate distance on basis of  src and dest
		 //  =  12*100+250-100
		//rate FROM rate card * distance+ booking fees+ offerCodeRate
		
		Integer amount = 5000;
//		ResponseEntity<RideEstimate> responseEntity = new RestTemplate().getForEntity(
//		        "http://localhost:8000/rateCardWithOffer/offerCode/{offercode}", RideEstimate.class,
//		        offerCode);

		
		
		 //RideEstimate response = responseEntity.getBody();
		

		RideEstimate  response = proxy.rideEstimatecalculation(offerCode);

	   

		    return new  RideEstimate(src, dest,(response.discount* amount), 1000.00, 4000.00, response.discount);
		  }
		
	}

