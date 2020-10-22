package edu.mve.prj.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Client {
    private String id;
    private String name;
    private String adres;
    private String phone;
    private LocalDate birthday;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;

    public Client() {
    }

    public Client(String name, String adres, String phone, LocalDate birthday, String description) {
        this.name = name;
        this.adres = adres;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
    }

    public Client(String id, String name, String adres, String phone, LocalDate birthday,
                  String description, LocalDateTime created_at, LocalDateTime modified_at) {
        this.id = id;
        this.name = name;
        this.adres = adres;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
        this.created_at = created_at;
        this.modified_at = modified_at;
    }

    public Client(String id, String name, String adres, String phone, LocalDate birthday, String description) {
        this.id = id;
        this.name = name;
        this.adres = adres;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getModified_at() {
        return modified_at;
    }

    public void setModified_at(LocalDateTime modified_at) {
        this.modified_at = modified_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return getId().equals(client.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", adres='" + adres + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", modified_at=" + modified_at +
                '}';
    }
}
