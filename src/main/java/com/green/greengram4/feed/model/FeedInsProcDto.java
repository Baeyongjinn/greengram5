package com.green.greengram4.feed.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FeedInsProcDto {
    private int ifeed;
    private int iuser;
    private String contents;
    private String location;
    private List<String> pics;
}
