package com.projets_profesionnels.v3.model;
 

public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1),
    ;

    VoteType(int direction) {
    }
    
}