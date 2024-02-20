package com.green.greengram4.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Embeddable
@EqualsAndHashCode
public class FeedFavIds implements Serializable {
    private Long ifeed;
    private Long iuser;
}
