package com.lol.community.user.form;

import java.time.LocalDateTime;
import lombok.Data;

@Data
    public class UserListForm {
        private String name;
        private String email;
        private String gradeCode;
        private LocalDateTime createdAt;
    }

