package com.greenfox.balintvecsey.reddit.service;

import com.greenfox.balintvecsey.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostRepository extends CrudRepository<Post, Long> {

}
