package com.metacoding.upload;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "upload_tb")
public class Upload {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String profileUrl;

    @Builder
    public Upload(int id, String username, String profileUrl) {
        this.id = id;
        this.username = username;
        this.profileUrl = profileUrl;
    }
}
