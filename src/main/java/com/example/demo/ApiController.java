import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @RequestMapping(value = "/api/super-shy", method = RequestMethod.PATCH)
    public ResponseEntity<String> handleSuperShyPatchRequest() {
        // PATCH 요청을 처리하는 로직
        String responseMessage = "Super Shy PATCH 요청이 처리되었습니다.";
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/api/super-shy", method = RequestMethod.GET)
    public ResponseEntity<String> handleSuperShyGetRequest() {
        // GET 요청을 처리하는 로직
        String responseMessage = "Super Shy GET 요청이 처리되었습니다.";
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }
}
