package kz.dar.university.post.office.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostDetailedResponse {
    private String postId;
    private ClientResponse client;
    private ClientResponse receiver;
    private String postItem;
    private String status;
}
