package hello.advanced.app.kim;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class Noraml {

    private final TestService testService;

    public String test(){
        log.info("전 처리 ex: 서비스 시작 일시 ");
        //비즈니스 로직
        testService.doLogic();

        log.info("후 처리 ex: 서비스 종료 일시 ");

        return "ok";
    }
}
