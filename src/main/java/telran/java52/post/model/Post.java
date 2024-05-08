package telran.java52.post.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import telran.java52.post.dto.CommentDto;

@Getter
@NoArgsConstructor
@Document(collection = "posts")
public class Post {
	long id;
	String title;
	@Setter
	String content;
	String author;
	LocalDateTime dateCreated;
	int likes;
	List<CommentDto> comments;
}
