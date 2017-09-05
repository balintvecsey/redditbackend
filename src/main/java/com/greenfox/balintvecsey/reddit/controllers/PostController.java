package com.greenfox.balintvecsey.reddit.controllers;

import com.greenfox.balintvecsey.reddit.models.Post;
import com.greenfox.balintvecsey.reddit.service.RedditService;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class PostController {

  @Autowired
  private RedditService redditService;

  @GetMapping("/posts")
  public HashMap<String, Iterable<Post>> listAllPosts() {
    return redditService.listAll();
  }

  @PostMapping ("/posts")
  public Post addPost(@RequestBody Post post) {
    return redditService.addPost(post);
  }

  @PutMapping ("/posts/{id}/upvote")
  public Post upVote(@PathVariable Long id) {
    return redditService.vote(id, 1);
  }

  @PutMapping ("/posts/{id}/downvote")
  public Post downVote(@PathVariable Long id) {
    return redditService.vote(id, -1);
  }
}
