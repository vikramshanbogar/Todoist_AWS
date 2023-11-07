package com.vikram.todoistaws.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "Tasks")
@Data
public class Tasks {
    @Id
    public String id;
    public String creator_id;
    public Date created_at;

    public String assignee_id;
    public String assigner_id;
    public int comment_count;
    public boolean is_completed;
    public String content;
    public String description;
    @Transient
    public Due due;
    @Transient
    public Duration duration;
    @Transient
    public ArrayList<String> labels;
    public Integer orderNo;
    public Integer priority;
    public String project_id;
    public String section_id;
    public String parent_id;
    public String url;
}

