import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class Main {

    @Test
    public void filteredOnTest() {
        List<Integer> numberArr = new ArrayList<>();

        numberArr.add(1);
        numberArr.add(2);
        numberArr.add(3);

        assertThat(numberArr).as(
                "filteredOn test"
        ).filteredOn(n -> n % 2 == 0).containsExactly(2, 4);


    }
}