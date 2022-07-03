package CVApp;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/import")
@RequiredArgsConstructor
public class PDController {
    private PDService pdService;

    @PostMapping
    public ResponseEntity<Name> createName(@RequestBody Name newName){
        return ResponseEntity.status(201)
                .body(pdService.createName(newName));
    }



}
