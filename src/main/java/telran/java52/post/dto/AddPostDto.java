package telran.java52.post.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddPostDto {
	String title;
	String content;
	String author;
	List<String> tags;
}
