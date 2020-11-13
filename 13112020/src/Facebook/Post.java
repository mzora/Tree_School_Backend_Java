package Facebook;
import java.util.*;

public class Post {
    private User owner;
    private String content;
    private LinkedList<Comment> commentList;
    private HashSet<UUID> likes;

    public Post(String content,User user){
        this.owner=user;
        this.content=content;
        likes=new HashSet<>();
        commentList=new LinkedList<Comment>();
    }

    public void addOrRemoveLike(User user){
        UUID userId = user.getId();
        if(!likes.contains(userId)){
            likes.add(userId);
        }else{
            likes.remove(userId);
        }
    }

    public void addComment(User user){
        Scanner sc =new Scanner(System.in);
        System.out.println("Write new Comment "+user.getNome());
        String text = sc.nextLine();

        Comment commentByUser = new Comment(user,text);
        commentList.addLast(commentByUser);
    }

    public void removeComment(User user){
        ArrayList<Comment> listaCommentiUtente =new ArrayList<>();

        for(Comment comment : commentList){
            if(comment.getWrittenBy().equals(user)){
                listaCommentiUtente.add(comment);
            }
        }

        System.out.println("Scegli il commento da cancellare");
        for(int i=0;i<listaCommentiUtente.size();i++) {
            System.out.println(i+" "+listaCommentiUtente.get(i));
        }

        Scanner sc =new Scanner(System.in);
        int indexComment = sc.nextInt();
        UUID toDelete = listaCommentiUtente.get(indexComment).getId();

        commentList.removeIf(comment -> comment.getId().equals(toDelete));

        listaCommentiUtente.clear();
        for(Comment comment : commentList){
            if(comment.getWrittenBy().equals(user)){
                listaCommentiUtente.add(comment);
            }
        }
        System.out.println("Commenti rimanenti");
        for(int i=0;i<listaCommentiUtente.size();i++) {
            System.out.println(i+" "+listaCommentiUtente.get(i));
        }
    }

    public User getOwner() {
        return owner;
    }

}
