import org.springframework.web.bind.annotation.*;

//@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @GetMapping("/api/v1/user")
    public String getUserEmpNo() {
        // 실제 데이터베이스에서 사번 조회 로직
        //String empNo = "82107492"; // 예시: 실제로는 DB에서 조회해야 함
        return "82107492";
    }
}
