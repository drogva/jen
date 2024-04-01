import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping(value = "/api/super-shy", method = RequestMethod.PATCH) // PATCH 요청을 처리하는 메서드
    public String handleSuperShyPatchRequest() {
        // PATCH 요청을 처리하는 로직을 여기에 구현합니다.
        return "Super Shy PATCH 요청이 처리되었습니다.";
    }
    
    @RequestMapping(value = "/api/super-shy", method = RequestMethod.GET) // GET 요청을 처리하는 메서드
    public String handleSuperShyGetRequest() {
        // GET 요청을 처리하는 로직을 여기에 구현합니다.
        return "Super Shy GET 요청이 처리되었습니다.";
    }
}
