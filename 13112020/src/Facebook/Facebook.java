package Facebook;

import java.util.*;

public class Facebook {
    private Map<UUID,User> users;
    private List<Post> posts;

    public Facebook(){
        users = new HashMap<>();
        posts = new LinkedList<>();
    }

    public void signUP(String nome, String cognome){
        User user = new User(nome,cognome);
        users.put(user.getId(),user);
    }

    public static void newFriendship(User requestingUser, User newFriend){
        if(!requestingUser.getFriends().contains(newFriend.getId())){
            requestingUser.addFriend(newFriend);
            newFriend.addFriend(requestingUser);
            System.out.println("Established new friendship");
        }else{
            System.out.println("Already Friends!!");
        }
        /* TODO: send request */
    }

    public void addPost(Post post){
        posts.add(post);
    }

    public ArrayList<Post> getPostsByUser(User user){
        ArrayList<Post> postedByUser = new ArrayList<>();
        for(Post p : posts){
            if(p.getAuthor().equals(user.getId())){
                postedByUser.add(p);
            }
        }
        return postedByUser;
    }

    public HashSet<Post> getPostsCommentedByUser(User user){
        //ArrayList<Post> postsCommentedByUser = new ArrayList<>();//non gestisce i duplicati
        HashSet<Post> postsCommentedByUser =new HashSet<>();
        for(Post p : posts){
            for (Comment comment : p.getCommentList()) {
                if(comment.getWrittenBy().equals(user.getId())){
                    postsCommentedByUser.add(p);
                }
            }
        }
        for (Post post : postsCommentedByUser) {
            System.out.println(post.toString());
        }
        return postsCommentedByUser;
    }

}
