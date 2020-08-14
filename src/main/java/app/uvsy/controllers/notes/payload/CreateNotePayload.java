package app.uvsy.controllers.notes.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateNotePayload {
    private final String title;
    private final String description;

    public CreateNotePayload(@JsonProperty(value = "title", required = true) String title,
                             @JsonProperty(value = "description", required = true) String description) {
        this.title = title;
        this.description = description;
    }
}
