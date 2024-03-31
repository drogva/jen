import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @PatchMapping("/api/super-shy")
    public String handleSuperShyPostRequest() {
        // PATCH 요청을 처리하는 로직을 여기에 구현합니다.
        return "Super Shy PATCH 요청이 처리되었습니다.";
    }
    
    @GetMapping("/api/super-shy")
    public String handleSuperShyGetRequest() {
        // GET 요청을 처리하는 로직을 여기에 구현합니다.
        return "Super Shy GET 요청이 처리되었습니다.";
    }
}
