package com.projets_profesionels.v01.model;

import com.projets_profesionels.v01.exceptions.SpringContentException;

import java.util.Arrays;

public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1),
    ;

    private int direction;

    VoteType(int direction) {
    }

    public static VoteType lookup(Integer direction) {
        return Arrays.stream(VoteType.values())
                .filter(value -> value.getDirection().equals(direction))
                .findAny()
                .orElseThrow(() -> new SpringContentException("Vote not found"));
    }

    public Integer getDirection() {
        return direction;
    }
}