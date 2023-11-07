package com.vikram.todoistaws.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Item {

    String completed_at;
    String content;
    @Id
    Long id;
    String meta_data;
    Long project_id;
    Long task_id;
    Long user_id;

    public String getCompleted_at() {
        return completed_at;
    }

    public void setCompleted_at(String completed_at) {
        this.completed_at = completed_at;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Item [completed_date=" + completed_at + ", content=" + content + ", id=" + id + ", meta_data="
                + meta_data + ", project_id=" + project_id + ", task_id=" + task_id + ", user_id=" + user_id + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeta_data() {
        return meta_data;
    }

    public void setMeta_data(String meta_data) {
        this.meta_data = meta_data;
    }

    public Long getProject_id() {
        return project_id;
    }

    public void setProject_id(Long project_id) {
        this.project_id = project_id;
    }

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}