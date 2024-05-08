package telran.java52.post.dto;

import java.time.LocalDateTime;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
	Long id;
	String title;
	String content;
	String author;
	LocalDateTime dateCreated;
	int likes;
	List<CommentDto> comments;
}
