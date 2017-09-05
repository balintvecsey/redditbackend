package com.greenfox.balintvecsey.reddit.service;

import com.greenfox.balintvecsey.reddit.models.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 05. 12..
 */
@Component
public interface PostRepository extends CrudRepository<Post, Long> {

//  @Query(value = "SELECT p.id, p.title, p.href, p.timestamp, p.score, u.username AS owner FROM post p "
//      + "LEFT JOIN user u "
//      + "ON u.user_id = p.owner_user_id "
//      + "ORDER BY id", nativeQuery = true)
//  Iterable<Post> findAll();
}
