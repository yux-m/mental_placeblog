package cit59x.hackathon.mental_placeblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {

    /**
     * Direct to new post page.
     *
     * @return
     */
    @RequestMapping("/new")
    public String toNewPostPage() {
        //TODO
        return null;
    }

    /**
     * Create a new post with frontend inputs and store into database.
     *
     * @return
     */
    @RequestMapping("/new/process")
    public String createNewPost() {
        //TODO
        return null;
    }

    /**
     * Get a list of posts by current user. Add to model for frontend use.
     *
     * @return
     */
    @RequestMapping("/all")
    public String viewAllPosts() {
        //TODO
        return null;
    }

    /**
     * Get a single post and add to model for frontend use.
     *
     * @return
     */
    @RequestMapping("/detail/{postID}")
    public String viewPost() {
        //TODO
        return null;
    }

    //Other features including edit/delete are to be decided & added
}
