package telran.java52.post.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class UpdatePostDto {
	String title;
	String content;
	List<String> tags;
}
