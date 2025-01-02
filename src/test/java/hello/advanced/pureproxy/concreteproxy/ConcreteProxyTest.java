package hello.advanced.pureproxy.concreteproxy;

import hello.advanced.pureproxy.concreteproxy.code.ConcreteClient;
import hello.advanced.pureproxy.concreteproxy.code.ConcreteLogic;
import hello.advanced.pureproxy.concreteproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {
    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient concreteClient = new ConcreteClient(concreteLogic);
        concreteClient.execute();
    }


    @Test
    void addProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        TimeProxy tImeProxy = new TimeProxy(concreteLogic);
        ConcreteClient concreteClient = new ConcreteClient(tImeProxy);
        concreteClient.execute();
    }
}
