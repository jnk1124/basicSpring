package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다")
    void vip_o(){

        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);

        int discount = discountPolicy.discount(memberVIP, 10000);

        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 10% 할인이 적용 안되어야 한다")
    void vip_x(){

        Member memberVIP = new Member(1L, "memberVIP", Grade.BASIC);

        int discount = discountPolicy.discount(memberVIP, 10000);

        assertThat(discount).isEqualTo(0);
    }
}