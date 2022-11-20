package bridge.domain.generator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.anyOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BridgeRandomNumberGeneratorTest {

    @DisplayName("0 또는 1 중 하나의 랜덤한 숫자를 생성한다.")
    @Test
    void generateRandomNumber() {
        BridgeRandomNumberGenerator generator = new BridgeRandomNumberGenerator();
        assertThat(generator.generate()).satisfiesAnyOf(
                randomNumber -> assertThat(randomNumber).isEqualTo(0),
                randomNumber -> assertThat(randomNumber).isEqualTo(1)
        );
    }
}