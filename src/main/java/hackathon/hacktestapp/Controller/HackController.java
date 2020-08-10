package hackathon.hacktestapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HackController {

    @GetMapping("/test")
    public String TestMethod ()
    {
        //TODO :-AutoDeploy
        return "Test Success";
    }
}
