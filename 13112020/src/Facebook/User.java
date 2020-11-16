package Facebook;

import java.time.LocalDateTime;
import java.util.*;

public class User implements Comparable<User> {
    private UUID id;
    private String nome;
    private String cognome;
    private LocalDateTime signUp;
    private Set<UUID> friends;

    public User(String nome, String cognome) {
        this.id = UUID.randomUUID();
        this.signUp= LocalDateTime.now();
        this.nome = nome;
        this.cognome=cognome;
        this.friends = new HashSet<>();
    }

    public UUID getId() {
        return id;
    }

    public void addFriend(User user){
        friends.add(user.getId());
    }

    public void removeFriend(User user){
        friends.remove(user.getId());
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

    public Set<UUID> getFriends() {
        return friends;
    }

    public LocalDateTime getSignUp() {
        return signUp;
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

    @Override
    public int compareTo(User o) {
        return o.getSignUp().compareTo(this.getSignUp());
    }
}
