package be.bxlformation.api;

import be.bxlformation.api.task.model.dto.AddinfoDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private final StringService service;
    public  HelloController(StringService service){
        this.service = service;
    }
    @GetMapping("/hello")
    public String getHello(){
        return  "Hello world!!";
    }

    @GetMapping("/uppercase")
    public String toUppercase(@RequestParam("msg") String message){

        return  this.service.toUppercase(message);
    }
    @GetMapping("/strings/{i}")
    public String getString(@PathVariable("i") int index){
        return service.get(index);
    }
    @PostMapping("/strings/add")
    public void add(@RequestBody AddinfoDTO dto){
        service.add(dto.getIndex(),dto.getMessage());
    }

}
