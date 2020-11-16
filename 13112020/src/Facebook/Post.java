package Facebook;
import java.util.*;

public class Post {
    private final UUID author;
    private final String authorName;
    private String content;
    private LinkedList<Comment> commentList;
    private HashSet<UUID> likes;

    public Post(String content,User user){
        this.author=user.getId();
        this.authorName=user.getNome();
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
        System.out.println("Write new Comment "+user.getNome()+" to "+this.authorName+"'s post.");
        String text = sc.nextLine();

        Comment commentByUser = new Comment(user,text);
        commentList.addLast(commentByUser);
    }

    public void removeComment(User user){
        ArrayList<Comment> listaCommentiUtente =new ArrayList<>();

        for(Comment comment : commentList){
            if(comment.getWrittenBy().equals(user.getId())){
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
            if(comment.getWrittenBy().equals(user.getId())){
                listaCommentiUtente.add(comment);
            }
        }
        System.out.println("Commenti rimanenti");
        for(int i=0;i<listaCommentiUtente.size();i++) {
            System.out.println(i+" "+listaCommentiUtente.get(i));
        }
    }

    public UUID getAuthor() {
        return author;
    }

    public String getAuthorName() {
        return authorName;
    }

    public LinkedList<Comment> getCommentList() {
        return commentList;
    }

    @Override
    public String toString() {
        return "Post{" +
                "author=" + author +
                ", content='" + content + '\'' +
                ", likes=" + likes.size() +
                '}';
    }
}
