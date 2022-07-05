package CVApp;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/import")
@RequiredArgsConstructor
public class PDController {
    private final PDService pdService;

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person newName){
        return ResponseEntity.status(201)
                .body(pdService.createPerson(newName));
    }

@GetMapping
    public ResponseEntity<List<Person>> getPerson(){
        return ResponseEntity.status(200).body(pdService.getPersons());
}
}
