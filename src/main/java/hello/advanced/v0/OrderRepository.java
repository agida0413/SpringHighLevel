package hello.advanced.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import static java.lang.Thread.*;
@Repository
@RequiredArgsConstructor
public class OrderRepository {

    public void save(String itemId){
        if(itemId.equals("ex")){
            throw new IllegalStateException("예외발생");
        }
        sleep(1000);
    }

    private void sleep(int i){
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
