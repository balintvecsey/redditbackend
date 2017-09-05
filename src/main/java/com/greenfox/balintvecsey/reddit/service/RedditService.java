package com.greenfox.balintvecsey.reddit.service;

import com.greenfox.balintvecsey.reddit.models.Post;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class RedditService {

  @Autowired
  private PostRepository postRepository;

  @Autowired
  private Post post;

  public RedditService() {}

  public HashMap<String, Iterable<Post>> listAll() {
    HashMap<String, Iterable<Post>> hashPosts = new HashMap<>();
    hashPosts.put("posts", postRepository.findAll());
    return hashPosts;
  }

  public Post vote(Long id, int addition) {
    post = postRepository.findOne(id);
    post.setScore(post.getScore() + addition);
    postRepository.save(post);
    return post;
  }

  public Post addPost(Post post) {
    post.setOwner("anonymus");
    postRepository.save(post);
    return post;
  }
}
