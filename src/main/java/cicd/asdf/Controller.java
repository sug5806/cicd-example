package cicd.asdf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    @ResponseBody
//    public ResponseEntity<Response> HelloController() {
    public Response HelloController() {
        //        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(new MediaType("application", "json", StandardCharsets.UTF_8));
//
//        return new ResponseEntity<>(response, headers, HttpStatus.OK);
        return new Response("ㅁㄴㅇ");
    }

    @GetMapping("/deploy")
    @ResponseBody
    public Response HelloDeploy() {
        return new Response("hello deploy");
    }
}