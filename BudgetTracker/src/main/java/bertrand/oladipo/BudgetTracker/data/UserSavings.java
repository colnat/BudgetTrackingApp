package bertrand.oladipo.BudgetTracker.data;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.io.Serializable;


@Valid
@Data
public class UserSavings implements Serializable{
    @Id
    private String id;
    @NotBlank
    private String name;
    @NotNull
    private Integer price;
    @NotNull
    private Integer moNeyTowardsItem;

    @DBRef
    private User user;

    public UserSavings() {

    }
    public UserSavings(String name, Integer price, Integer moNeyTowardsItem,User user){
        this.name = name;
        this.price = price;
        this.moNeyTowardsItem = moNeyTowardsItem;
        this.user = user;
    }
}

