package com.example.taskmanagementsystem.task.dto;

import com.example.taskmanagementsystem.task.entity.TaskPriority;
import com.example.taskmanagementsystem.task.entity.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskBaseDto {

    private String title;

    private String description;

    private TaskStatus status;

    private TaskPriority priority;

    private Integer authorId;

    private Integer assigneeId;
}
