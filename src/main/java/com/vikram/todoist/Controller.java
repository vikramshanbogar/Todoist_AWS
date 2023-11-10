package com.vikram.todoist;


import com.vikram.todoist.model.Item;
import com.vikram.todoist.model.ItemsCompleted;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    private static final String TOKEN = "e778d1a5a64e29adf80e019719285d92699ed34a";

//    @Autowired
//    ItemRepo itemRepo;

    @GetMapping("getCompleted")
    public ResponseEntity getAllCompletedTasks(String fromDate) {
        final String uri = "https://api.todoist.com/sync/v9/completed/get_all?since=" + fromDate + "T00:00";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + TOKEN);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<ItemsCompleted> response = restTemplate.exchange(uri, HttpMethod.GET, entity,
                ItemsCompleted.class);
        //System.out.println(response.getBody().getItems());
        Map<String, List<String>> map = new HashMap<>();

        for (Item item : response.getBody().getItems()) {
            if (map.get(item.getCompleted_at().substring(0, 10)) != null) {
                List<String> listOfItems = map.get(item.getCompleted_at().substring(0, 10));
                listOfItems.add(item.getContent());
                map.put(item.getCompleted_at().substring(0, 10), listOfItems);
              //  itemRepo.save(item);
            } else {
                List<String> listOfItems = new ArrayList<>();
                listOfItems.add(item.getContent());
               // itemRepo.save(item);
                map.put(item.getCompleted_at().substring(0, 10), listOfItems);
            }
        }
        return new ResponseEntity(map, HttpStatus.OK);
    }
}
