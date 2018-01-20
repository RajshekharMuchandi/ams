package com.ams.utils;

import java.net.URI;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ams.beans.FlatBean;

public class RestClientUtil {

	public static void main(String[] args) {
		
		RestClientUtil restClientUtil = new RestClientUtil();
		//restClientUtil.addFlatDemo();
		
		restClientUtil.getAllFlatsDemo();
	}

	public void addFlatDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/AMS/flat";
	    
	    FlatBean flatBean = getFlatBean();
	    HttpEntity<FlatBean> requestEntity = new HttpEntity<FlatBean>(flatBean, headers);
	    ResponseEntity<FlatBean> uri = restTemplate.exchange(url, HttpMethod.POST, requestEntity, FlatBean.class);

        System.out.println(uri.getBody());  	
    }
	
	 public void getAllFlatsDemo() {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
		        RestTemplate restTemplate = new RestTemplate();
			String url = "http://localhost:8080/findAll/";
		        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		        ResponseEntity<FlatBean[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, FlatBean[].class);
		        FlatBean[] flatBeans = responseEntity.getBody();
		        for(FlatBean flat : flatBeans) {
		              System.out.println("Id:"+flat.getFlatId());
		        }
		    }

	private FlatBean getFlatBean() {
		FlatBean flatBean = new FlatBean();
		flatBean.setElectricityMeter("872839749");
		flatBean.setFlatArea("2000");
		flatBean.setFlatId(new Long(123));
		flatBean.setFlatNumber("A-101");
		flatBean.setFloorNumber("3");
		flatBean.setFurnishedType("SEMI");
		flatBean.setGasMeter("GS8986875");
		flatBean.setParkingDetails("A0110 - P001");
		flatBean.setWing("A");
		return flatBean;
	}
}
