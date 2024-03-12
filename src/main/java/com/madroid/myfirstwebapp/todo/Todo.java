package com.madroid.myfirstwebapp.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {

    @Id
    private int id;

    private String username;

    @Size(min = 5, message = "At least 3 characters")
    private String description;

    private LocalDate targetDate;
    private boolean done;

    @Override
    public String toString() {
        return "Todo{" +
               "id=" + id +
               ", username='" + username + '\'' +
               ", description='" + description + '\'' +
               ", targetDate=" + targetDate +
               ", done=" + done +
               '}';
    }
}
