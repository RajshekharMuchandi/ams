package com.ams.utils;

import com.ams.beans.FlatBean;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		ObjectMapper mapper = new ObjectMapper();
		 
        /**
         * Write object to file
         */
        try {
           System.out.println(mapper.writeValueAsString(flatBean)); ;//Plain JSON
            //mapper.writerWithDefaultPrettyPrinter().writeValue(new File("result.json"), carFleet);//Prettified JSON
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
