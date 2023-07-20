package be.bxlformation.api.task.model.dto;

import be.bxlformation.api.task.model.entity.Urgence;

import java.time.LocalDate;

public class CreateTaskDto {
    private long uniqueID;
    private String description;
    private Urgence urgency;
    private LocalDate deadline;

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Urgence getUrgency() {
        return urgency;
    }

    public void setUrgency(Urgence urgency) {
        this.urgency = urgency;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
