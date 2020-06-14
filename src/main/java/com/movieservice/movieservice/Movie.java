package com.movieservice.movieservice;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Movie {
    @Id
    public String identifier;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    public  String description;
    @ElementCollection
    public List<String> images;
}
