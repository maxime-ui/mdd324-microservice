package com.ipiecoles.java.mdd324;

import java.util.Objects;

public class ServiceFilm {

    String title ;
    String categorie ;
    String description;

    public ServiceFilm(String title, String description, String categorie) {
        this.title = title;
        this.description = description;
        this.categorie = categorie;
    }

    public ServiceFilm() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
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
        ServiceFilm that = (ServiceFilm) o;
        return Objects.equals(title, that.title) && Objects.equals(categorie, that.categorie) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, categorie, description);
    }
}
