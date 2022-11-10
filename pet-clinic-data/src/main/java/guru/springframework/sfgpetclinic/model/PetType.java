package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{
//    @Builder
//    public PetType(Long id, String name){
//        super(id);
//        this.name = name;
//    }

    @Column(name = "name")
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
