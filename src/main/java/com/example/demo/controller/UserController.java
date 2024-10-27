import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @GetMapping
    public String getUserEmpNo() {
        // 실제 데이터베이스에서 사번 조회 로직
        String empNo = "82107492"; // 예시: 실제로는 DB에서 조회해야 함
        return empNo;
    }
}
