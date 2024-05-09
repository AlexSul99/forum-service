package telran.java52.forum.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import telran.java52.forum.service.ForumService;
import telran.java52.post.dto.AddPostDto;
import telran.java52.post.dto.CommentDto;
import telran.java52.post.dto.PostDto;
import telran.java52.post.dto.UpdatePostDto;



@RestController
@RequestMapping("/forum")
public class ForumController {

    @Autowired
    private ForumService forumService;

    @PostMapping("/post/{user}")
    public PostDto addPost(@RequestBody AddPostDto addPostDto, @PathVariable String user) {
        return forumService.addPost(addPostDto);
    }

    @GetMapping("/post/{postId}")
    public PostDto findPost(@PathVariable Long postId) {
        return forumService.findPost(postId);
    }

    @PostMapping("/post/{postId}/like")
    public void addLike(@PathVariable Long postId) {
        forumService.addLike(postId);
    }

    @GetMapping("/posts/author/{author}")
    public List<PostDto> findPostsByAuthor(@PathVariable String author) {
        return forumService.findPostsByAuthor(author);
    }

    @PostMapping("/post/{postId}/comment/{user}")
    public boolean addComment(@PathVariable Long postId, @RequestBody CommentDto commentDto, @PathVariable String user) {
        return forumService.addComment(postId, commentDto);
    }

    @DeleteMapping("/post/{postId}")
    public PostDto deletePost(@PathVariable Long postId) {
        return forumService.deletePost(postId);
    }

    @GetMapping("/posts/tags")
    public List<PostDto> findPostsByTags(@RequestBody List<String> tags) {
        return forumService.findPostsByTags(tags);
    }

    @GetMapping("/posts/period")
    public List<PostDto> findPostsByPeriod(@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                           @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return forumService.findPostsByPeriod(startDate, endDate);
    }

    @PutMapping("/post/{postId}")
    public PostDto updatePost(@PathVariable Long postId, @RequestBody UpdatePostDto updatePostDto) {
        return forumService.updatePost(postId, updatePostDto);
    }
}
