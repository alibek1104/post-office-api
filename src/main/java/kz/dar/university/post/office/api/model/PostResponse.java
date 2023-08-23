package kz.dar.university.post.office.api.model;

import lombok.Data;

@Data
public class PostResponse {

    private String postId;
    private ClientResponse client;
    private ClientResponse receiver;
    private String postItem;
    private String status;
}
