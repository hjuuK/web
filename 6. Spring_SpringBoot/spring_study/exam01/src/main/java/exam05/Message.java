package exam05;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {
    public void send(String message) {
        System.out.println("보낸 메세지 : " + message);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet!!"); // 초기화 단계에서 호출
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy!!"); // 소멸 단계 전에 호출 // 자원 해제에 대한 것들
    }
}
