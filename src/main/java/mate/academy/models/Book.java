package mate.academy.models;

import mate.academy.lib.Entity;
import mate.academy.lib.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "books", schema = "test")
public class Book {
    private Long id;
    private String title;
    private BigDecimal price;

    public Book() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
