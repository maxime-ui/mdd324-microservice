package com.ipiecoles.java.mdd324.POJO;


import java.util.Objects;

public class Film {
    String title ;
    String categorie ;
    String description;

    public Film(String title, String categorie, String description) {
        this.title = title;
        this.categorie = categorie;
        this.description = description;
    }

    public Film() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ServiceFilm{" +
                "title='" + title + '\'' +
                ", categorie='" + categorie + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(title, film.title) && Objects.equals(categorie, film.categorie) && Objects.equals(description, film.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, categorie, description);
    }
}

