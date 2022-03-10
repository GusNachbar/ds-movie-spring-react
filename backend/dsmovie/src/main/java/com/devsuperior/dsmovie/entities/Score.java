package com.devsuperior.dsmovie.entities;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Score {

    @EmbeddedId
    private ScorePk id = new ScorePk();

    private Double value;

    public void setMovie(Movie movie){
        id.setMovie(movie);
    }
    public void setUser( User user){
        id.setUser(user);
    }
}
