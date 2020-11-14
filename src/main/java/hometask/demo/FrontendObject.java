package hometask.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@AllArgsConstructor
@NoArgsConstructor
public class FrontendObject {
    private Object res;
}
