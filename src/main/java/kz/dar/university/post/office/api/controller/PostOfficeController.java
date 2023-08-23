package kz.dar.university.post.office.api.controller;

import kz.dar.university.post.office.api.feign.ClientFeign;
import kz.dar.university.post.office.api.feign.PostFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/office")
@RequiredArgsConstructor
public class PostOfficeController {

    private final PostFeign postFeign;
    private final ClientFeign clientFeign;

    @GetMapping("/post")
    public String checkPostOffice() {
        return "post-office-api is working";
    }

    @GetMapping("/post/check")
    public String postCheck() {
        return postFeign.checkPost();
    }

    @GetMapping("/client/check")
    public String clientCheck() {
        return clientFeign.checkClient();
    }

}
