package Facebook;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Objects;
import java.util.UUID;

public class Comment {
    private final UUID id;
    private String comment;
    private User writtenBy;
    private LocalDateTime dateTime;

    public Comment(User user, String comment){
        this.id=UUID.randomUUID();
        this.comment=comment;
        this.writtenBy= user;
        this.dateTime=LocalDateTime.now();
    }

    public String getComment() {
        return comment;
    }

    public String getWrittenBy() {
        return writtenBy.getNome();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(id, comment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment='" + comment + '\'' +
                ", writtenBy=" + writtenBy +
                ", dateTime=" + dateTime +
                '}';
    }

}
