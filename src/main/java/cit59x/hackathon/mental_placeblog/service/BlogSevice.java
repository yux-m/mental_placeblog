package cit59x.hackathon.mental_placeblog.service;

import cit59x.hackathon.mental_placeblog.entity.BlogPost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogSevice {

    /**
     * Create a new blog post and return its ID.
     *
     * @return
     */
    public int createPost() {
        //TODO
        return -1;
    }

    /**
     * Get all blog posts of given user.
     *
     * @return
     */
    public List<BlogPost> getPostsByUserID(int userID) {
        //TODO
        return null;
    }

    /**
     * Get a blog post by its ID.
     *
     * @param postID
     * @return
     */
    public BlogPost getPostByID(int postID) {
        //TODO
        return null;
    }

    //Other features including edit/delete are to be decided & added
}
