package com.lol.community.board.dto.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardBaseResponse {
    private Integer id;
    private Integer categoryId;
    private Integer userId;
    private String boardType;
    private String title;
    private String content;
    private Boolean isDeleted;
    private Integer viewCount;
    private Integer likeCount;
    private Integer dislikeCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
