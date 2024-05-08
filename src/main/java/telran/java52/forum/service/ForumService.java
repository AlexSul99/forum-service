package telran.java52.forum.service;



import java.time.LocalDate;
import java.util.List;

import telran.java52.post.dto.AddPostDto;
import telran.java52.post.dto.CommentDto;
import telran.java52.post.dto.PostDto;
import telran.java52.post.dto.UpdatePostDto;


public interface ForumService {
	PostDto addPost(AddPostDto addPostDto);
	
	PostDto findPost(Long id);
	
	boolean addLike(Long id);
	
	List<PostDto> findPostsByAuthor(String author);
	
	boolean addComment(Long id, CommentDto  comment);
	
	PostDto deletePost(Long id);
	
	List<PostDto> findPostsByTags(List<String> tags);
	
	List<PostDto> findPostsByPeriod(LocalDate startDate, LocalDate endDate);
	
	boolean updatePost(Long id, UpdatePostDto updatePostDto);
	
	
	
	
	
	
	
	
}
