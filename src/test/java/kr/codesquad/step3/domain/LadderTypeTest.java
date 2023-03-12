package kr.codesquad.step3.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LadderTypeTest {

    @Test
    @DisplayName("boolean 값에 따른 LadderType반환 테스트")
    void isConnected() {
        assertThat(LadderType.getLadderType(true)).isEqualTo(LadderType.CONNECT);
        assertThat(LadderType.getLadderType(false)).isEqualTo(LadderType.DISCONNECT);
    }
}