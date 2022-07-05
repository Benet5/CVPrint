package CVApp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CVItemController {

    private final CVItemService cvItemService;
}
