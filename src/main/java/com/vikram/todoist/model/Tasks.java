package com.vikram.todoist.model;

import lombok.Data;


import java.util.ArrayList;
import java.util.Date;


@Data
public class Tasks {
    public String id;
    public String creator_id;
    public Date created_at;

    public String assignee_id;
    public String assigner_id;
    public int comment_count;
    public boolean is_completed;
    public String content;
    public String description;
    public Due due;
    public Duration duration;
    public ArrayList<String> labels;
    public Integer orderNo;
    public Integer priority;
    public String project_id;
    public String section_id;
    public String parent_id;
    public String url;
}

