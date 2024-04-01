import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @RequestMapping(value = "/api/super-shy", method = RequestMethod.PATCH)
    public ResponseEntity<MyResponse> handleSuperShyPatchRequest() {
        // PATCH 요청을 처리하는 로직
        MyResponse response = new MyResponse("Super Shy PATCH 요청이 처리되었습니다.");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/api/super-shy", method = RequestMethod.GET)
    public ResponseEntity<MyResponse> handleSuperShyGetRequest() {
        // GET 요청을 처리하는 로직
        MyResponse response = new MyResponse("Super Shy GET 요청이 처리되었습니다.");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    static class MyResponse {
        private String message;

        public MyResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
