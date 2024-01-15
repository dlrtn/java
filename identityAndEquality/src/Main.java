import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class Main {

    public class Member {
        private String name;
        private Integer age;

        public Member(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public Integer getAge() { return age; }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Member) {
                Member member = (Member) obj;
                return member.getName().equals(name) && (member.getAge().equals(age));
            } else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            return name.hashCode() + age.hashCode();
        }
    }

    @Test
    public void test() {
        Object obj = new Object();
        Object obj2 = new Object();

        assertFalse(obj.equals(obj2));

        String first = new String("Quora");
        String second = new String("Quora");

        assertTrue(first.equals(second));

        Member member1 = new Member("홍길동", 30);
        Member member2 = new Member("홍길동", 30);

        assertTrue(member1.equals(member2));
    }

    @Test
    public void setTest() {
        Member member1 = new Member("홍길동", 30);
        Member member2 = new Member("홍길동", 30);

        Set set = new HashSet<>();

        set.add(member1);
        set.add(member2);

        assertEquals(1, set.size());

        //필요:1
        //실제:1
    }

}