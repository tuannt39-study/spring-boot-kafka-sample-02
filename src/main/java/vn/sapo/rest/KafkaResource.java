package vn.sapo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import vn.sapo.domain.Bar1;
import vn.sapo.domain.Foo1;

@RestController
@RequestMapping(value = "/api/kafka")
public class KafkaResource {

    @Autowired
    private KafkaTemplate<Object, Object> template;

    @PostMapping(path = "/send/foo")
    public void sendFoo(@RequestParam("message") String message) {
        this.template.send("foos", new Foo1(message));
    }

    @PostMapping(path = "/send/bar")
    public void sendBar(@RequestParam("message") String message) {
        this.template.send("bars", new Bar1(message));
    }

    @PostMapping(path = "/send/unknown")
    public void sendUnknown(@RequestParam("message") String message) {
        this.template.send("bars", message);
    }

}
