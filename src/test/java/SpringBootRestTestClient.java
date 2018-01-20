
 
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.ams.beans.FlatBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

 

public class SpringBootRestTestClient {
 
    public static final String REST_SERVICE_URI = "http://localhost:8080/ams/api";
     
    /* GET */
    @SuppressWarnings("unchecked")
    private static void listAll(){
        System.out.println("Testing flat API-----------");
         
        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI+"/user/", List.class);
         
        if(usersMap!=null){
            for(LinkedHashMap<String, Object> map : usersMap){
                System.out.println("ams : id="+map.get("flatId")+", area="+map.get("flatArea"));
            }
        }else{
            System.out.println("No flat exist----------");
        }
    }
    
    /* POST */
    private static void createUser() throws JsonProcessingException {
        System.out.println("Testing create User API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(
        		  new BasicAuthorizationInterceptor("john123", "password"));
        FlatBean flatBean = new FlatBean();
        flatBean.setFlatId(1234l);
        flatBean.setFlatArea("2000");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

       // HttpEntity<String> entity = new HttpEntity<String>(new ObjectMapper().writeValueAsString(flatBean) ,headers);
       // restTemplate.put(REST_SERVICE_URI+"/flat/", entity);
        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/flat/", flatBean, FlatBean.class);
        System.out.println("Location : "+uri.toASCIIString());
    }
     
    /* PUT */
    private static void updateUser() {
        System.out.println("Testing update User API----------");
        RestTemplate restTemplate = new RestTemplate();
        FlatBean flatBean = new FlatBean();
        flatBean.setFlatId(1234l);
        flatBean.setFlatArea("2000");
        restTemplate.put(REST_SERVICE_URI+"/flat/1", flatBean);
        System.out.println(flatBean);
    }
    public static void main(String args[]) throws JsonProcessingException{
       // listAll();
        createUser();
      //  updateUser();
    }
}