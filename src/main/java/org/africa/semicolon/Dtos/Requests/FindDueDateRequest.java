package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

import java.time.LocalDate;
@Data
public class FindDueDateRequest {
    private LocalDate dateOfIssue;
    private LocalDate dueDate;

}
