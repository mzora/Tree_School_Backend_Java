package Facebook;

import java.util.*;

public class Facebook {
    private ArrayList<User> users;
    private List<Post> posts;

    public Facebook(){
        users = new ArrayList<>();
        posts = new LinkedList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addPost(Post post){
        posts.add(post);
    }

    public ArrayList<Post> getPostsByUser(User user){
        ArrayList<Post> postedByUser = new ArrayList();
        for(Post p : posts){
            if(p.getOwner().equals(user)){
                postedByUser.add(p);
            }
        }
        return postedByUser;
    }

    public ArrayList<Post> getPostsCommentedByUser(User user){
        ArrayList<Post> postedByUser = new ArrayList();
        for(Post p:posts){
            //TODO
        }

        return postedByUser;
    }
}
