package kz.dar.university.post.office.api.controller;

import kz.dar.university.post.office.api.feign.ClientFeign;
import kz.dar.university.post.office.api.feign.PostFeign;
import kz.dar.university.post.office.api.model.ClientResponse;
import kz.dar.university.post.office.api.model.PostDetailedResponse;
import kz.dar.university.post.office.api.model.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/office")
@RequiredArgsConstructor
public class PostOfficeController {

    @Autowired
    private PostFeign postFeign;
    @Autowired
    private ClientFeign clientFeign;

    @GetMapping("/check")
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

    @GetMapping("/post/all")
    public List<PostResponse> getAllPosts() {
        return postFeign.getAllPosts();
    }

    @GetMapping("/post/{postId}")
    public PostResponse getPostById(@PathVariable String postId) {
        return postFeign.getPostById(postId);
    }

    @GetMapping("/client/all")
    public List<ClientResponse> getAllClients() {
        return clientFeign.getAllClients();
    }

    @GetMapping("/client/{clientId}")
    public ClientResponse getClientById(@PathVariable String clientId) {
        return clientFeign.getClientById(clientId);
    }

    @GetMapping("/post/detailed")
    public List<PostDetailedResponse> getDetailedInfoAboutPosts(){
        List<PostDetailedResponse> list = new ArrayList<>();

        return list;
    }
}
