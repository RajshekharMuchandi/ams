package com.ams.utils;

import java.util.ArrayList;
import java.util.List;

import com.ams.beans.DocumentBean;
import com.ams.beans.FlatBean;
import com.ams.beans.UserBean;
import com.ams.entities.Document;
import com.ams.entities.Flat;
import com.ams.entities.User;

public class BeanUtils {

	/**
	 * This method copies bean to entity
	 * 
	 * @param documentBean DocumentBean
	 * @return document Document
	 */
	public static Document populateDocument(DocumentBean documentBean) {

		if (isNotNull(documentBean)) {
			Document document = new Document();
			document.setDocumentId(documentBean.getDocumentId());
			document.setDocumentName(documentBean.getDocumentName());
			document.setDocumentPath(documentBean.getDocumentPath());
			document.setUserId(documentBean.getUserId());
			return document;
		}

		return null;
	}

	/**
	 * Generic method for null value check
	 * 
	 * @param object Object
	 * @return boolean
	 */
	private static boolean isNotNull(Object object) {
		if (object != null) {
			return true;
		}
		return false;
	}
	
	
    /**
     * This method copies entities to beans
     * @param documents List<Document>
     * @return documentBeans List<DocumentBean>
     */
	public static List<DocumentBean> populateDocumentBeanList(List<Document> documents) {
		List<DocumentBean> documentBeans = new ArrayList<DocumentBean>();
	
		if(isNotNull(documents) && !documents.isEmpty()){			
			for(Document document : documents){
				DocumentBean documentBean = new DocumentBean();
				documentBean.setDocumentId(document.getDocumentId());
				documentBean.setDocumentName(document.getDocumentName());
				documentBean.setDocumentPath(document.getDocumentPath());
				documentBean.setUserId(document.getUserId());
				documentBeans.add(documentBean);
			}
		}
		
		return documentBeans;
	}

	/**
	 * This method copies entity to bean
	 * @param document Document
	 * @return documentBean DocumentBean
	 */
	public static DocumentBean populateDocumentBean(Document document) {

		if (isNotNull(document)) {
			DocumentBean documentBean = new DocumentBean();
			documentBean.setDocumentId(document.getDocumentId());
			documentBean.setDocumentName(document.getDocumentName());
			documentBean.setDocumentPath(document.getDocumentPath());
			documentBean.setUserId(document.getUserId());
			return documentBean;
		}
		return null;
	}
	
	/**
	 * This method copies bean to entity
	 * @param flatBean FlatBean
	 * @return flat Flat
	 */
	public static Flat populateFlat(FlatBean flatBean){
		
		if(isNotNull(flatBean)){
			Flat flat = new Flat();
			flat.setElectricityMeter(flatBean.getElectricityMeter());
			flat.setFlatArea(flatBean.getFlatArea());
			flat.setFlatId(flatBean.getFlatId());
			flat.setFlatNumber(flatBean.getFlatNumber());
			flat.setFloorNumber(flatBean.getFloorNumber());
			flat.setFurnishedType(flatBean.getFurnishedType());
			flat.setGasMeter(flatBean.getGasMeter());
			flat.setParkingDetails(flatBean.getParkingDetails());
			flat.setWing(flatBean.getWing());
			return flat;
		}
		
		return null;
    }
	
	 /**
     * This method copies entities to beans
     * @param flats List<Flat>
     * @return flatBeans List<FlatBean>
     */
	public static List<FlatBean> populateFlatBeanList(List<Flat> flats) {
		List<FlatBean> flatBeans = new ArrayList<FlatBean>();
	
		if(isNotNull(flats) && !flats.isEmpty()){			
			for(Flat flat : flats){
				FlatBean flatBean = new FlatBean();
				flatBean.setElectricityMeter(flat.getElectricityMeter());
				flatBean.setFlatArea(flat.getFlatArea());
				flatBean.setFlatId(flat.getFlatId());
				flatBean.setFlatNumber(flat.getFlatNumber());
				flatBean.setFloorNumber(flat.getFloorNumber());
				flatBean.setFurnishedType(flat.getFurnishedType());
				flatBean.setGasMeter(flat.getGasMeter());
				flatBean.setParkingDetails(flat.getParkingDetails());
				flatBean.setWing(flatBean.getWing());
			    flatBeans.add(flatBean);		
			}
		}
		
		return flatBeans;
	}

	 /**
     * This method copies entity to bean
     * @param flat Flat
     * @return flatBean FlatBean
     */
	public static FlatBean populateFlatBean(Flat flat) {
		if(isNotNull(flat)){			
				FlatBean flatBean = new FlatBean();
				flatBean.setElectricityMeter(flat.getElectricityMeter());
				flatBean.setFlatArea(flat.getFlatArea());
				flatBean.setFlatId(flat.getFlatId());
				flatBean.setFlatNumber(flat.getFlatNumber());
				flatBean.setFloorNumber(flat.getFloorNumber());
				flatBean.setFurnishedType(flat.getFurnishedType());
				flatBean.setGasMeter(flat.getGasMeter());
				flatBean.setParkingDetails(flat.getParkingDetails());
				flatBean.setWing(flatBean.getWing());
				return flatBean;
			}
		return null;
		
	}
	
	/**
	 * This method copies bean to entity
	 * @param userBean UserBean
	 * @return user User
	 */
	public static User populateUser(UserBean userBean){
		
		if(isNotNull(userBean)){
		    User user = new User();
		    user.setAdhaarCardNumber(userBean.getAdhaarCardNumber());
		    user.setAlternateContactNumber(userBean.getAlternateContactNumber());
		    user.setContactNumber(userBean.getContactNumber());
		    user.setCurrentAddress(userBean.getCurrentAddress());
		    user.setDateOfBirth(userBean.getDateOfBirth());
		    user.setFirstName(userBean.getFirstName());
		    user.setFlatId(userBean.getFlatId());
		    user.setLastName(userBean.getLastName());
		    user.setMiddleName(userBean.getMiddleName());
		    user.setOfficeAddress(userBean.getOfficeAddress());
		    user.setPanCardNumber(userBean.getPanCardNumber());
		    user.setPermanentAddress(userBean.getPermanentAddress());
		    user.setRegistrationDate(userBean.getRegistrationDate());
		    user.setRole(userBean.getRole());
		    user.setUserId(userBean.getUserId());
		}
		
		return null;
    }

	/**
	 * 	This method copies entities to beans
	 * @param users List<User>
	 * @return userBeans List<UserBean>
	 */
	public static List<UserBean> populateUserBeanList(List<User> users) {
		List<UserBean> userBeans = new ArrayList<UserBean>();
		
		if(isNotNull(users) && !users.isEmpty()){
			for(User user : users){
				UserBean userBean = new UserBean();
				userBean.setAdhaarCardNumber(user.getAdhaarCardNumber());
				userBean.setAlternateContactNumber(user.getAlternateContactNumber());
				userBean.setContactNumber(user.getContactNumber());
				userBean.setCurrentAddress(user.getCurrentAddress());
				userBean.setDateOfBirth(user.getDateOfBirth());
				userBean.setFirstName(user.getFirstName());
				userBean.setFlatId(user.getFlatId());
				userBean.setLastName(user.getLastName());
				userBean.setMiddleName(user.getMiddleName());
				userBean.setOfficeAddress(user.getOfficeAddress());
				userBean.setPanCardNumber(user.getPanCardNumber());
				userBean.setPermanentAddress(user.getPermanentAddress());
			    userBean.setRegistrationDate(user.getRegistrationDate());
			    userBean.setRole(user.getRole());
			    userBean.setUserId(user.getUserId());
			    userBeans.add(userBean);
			}
			
		}
		
		return userBeans;
	}

	/**
	 * This method copies entity to bean
	 * @param user User
	 * @return userBean UserBean
	 */
	public static UserBean populateUserBean(User user) {
		
		if(isNotNull(user)){
			UserBean userBean = new UserBean();
			userBean.setAdhaarCardNumber(user.getAdhaarCardNumber());
			userBean.setAlternateContactNumber(user.getAlternateContactNumber());
			userBean.setContactNumber(user.getContactNumber());
			userBean.setCurrentAddress(user.getCurrentAddress());
			userBean.setDateOfBirth(user.getDateOfBirth());
			userBean.setFirstName(user.getFirstName());
			userBean.setFlatId(user.getFlatId());
			userBean.setLastName(user.getLastName());
			userBean.setMiddleName(user.getMiddleName());
			userBean.setOfficeAddress(user.getOfficeAddress());
			userBean.setPanCardNumber(user.getPanCardNumber());
			userBean.setPermanentAddress(user.getPermanentAddress());
		    userBean.setRegistrationDate(user.getRegistrationDate());
		    userBean.setRole(user.getRole());
		    userBean.setUserId(user.getUserId());
            return userBean;	
		}
		return null;
	}


}
