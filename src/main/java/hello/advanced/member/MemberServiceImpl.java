package hello.advanced.member;

import hello.advanced.member.annotation.ClassAop;
import hello.advanced.member.annotation.MethodAop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@ClassAop
@Component
public class MemberServiceImpl implements MemberService {
    @Override
    @MethodAop("test value")
    public String hello(String param) {
        return "ok";
    }

    public String internal(String param) {
        return "ok";
    }
}
