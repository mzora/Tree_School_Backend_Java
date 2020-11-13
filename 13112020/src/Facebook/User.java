package Facebook;

import java.time.LocalDateTime;
import java.util.*;

public class User {
    private UUID id;
    private String nome;
    private String cognome;
    private LocalDateTime timestamp;

    private Set<UUID> friends;

    public User(String nome, String cognome) {
        this.id = UUID.randomUUID();
        this.timestamp= LocalDateTime.now();
        this.nome = nome;
        this.cognome=cognome;
        this.friends = new HashSet<>();
    }

    public UUID getId() {
        return id;
    }

    public void addFriend(User user){
        //TODO: amicizia riflessiva?
        boolean reflex = false;
        if(reflex){
            friends.add(user.getId());
        }
    }

    public void removeFriend(User user){
        friends.remove(user.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

}
