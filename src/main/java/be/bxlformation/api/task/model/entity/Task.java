package be.bxlformation.api.task.model.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter @Setter
public class Task {

    private long uniqueID;
    private String description;
    private Urgence urgency;
    private LocalDate deadline;

    public Task(long uniqueID, String description, Urgence urgency, LocalDate deadline) {
        this.uniqueID = uniqueID;
        this.description = description;
        this.urgency = urgency;
        this.deadline = deadline;
    }

    public Task(String description, Urgence urgency, LocalDate deadline) {
        this.description = description;
        this.urgency = urgency;
        this.deadline = deadline;
    }


}
