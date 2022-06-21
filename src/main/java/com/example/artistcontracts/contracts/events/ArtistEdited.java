package com.example.artistcontracts.contracts.events;

import lombok.Value;
import java.time.Instant;
@Value
public class ArtistEdited {
    private String artistId;
    private String firstName;
    private String lastName;
    private String alias;
    private String description;
    private String phrase;
    private String image;
    private String instagramLink;
    private String facebookLink;
    private String twitterLink;
    private Instant occurredOn;
}
