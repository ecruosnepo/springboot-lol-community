package com.lol.community.comment.service;

import com.lol.community.board.dto.response.BoardMainResponse;
import com.lol.community.comment.domain.Comment;
import com.lol.community.comment.dto.CommentPageResponseDTO;
import com.lol.community.comment.dto.CommentRequestDTO;
import com.lol.community.comment.dto.CommentResponseDTO;
import java.util.List;

public interface CommentService {

  Comment getComment(Integer comment_id);

  CommentPageResponseDTO getCommentList(Integer board_id, int page, Integer user_id);

  void writeComment(CommentRequestDTO commentRequestDTO);

  void updateComment(CommentRequestDTO commentRequestDTO);

  boolean deleteComment(Integer comment_id);

  List<CommentResponseDTO> getBestComment(Integer board_id);

  List<BoardMainResponse> findAllCommentByGroupByWithBoard(String boardType, Integer limit);
}
