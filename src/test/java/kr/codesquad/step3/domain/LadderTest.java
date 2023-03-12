package kr.codesquad.step3.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class LadderTest {
    private Participates participates;

    @BeforeEach
    void setUp() {
        participates = Participates.makeParticipates("aa,bb,cc,dd");
    }

    @Test
    @DisplayName("사다리 최대 높이만큼 사다리 생성 테스트")
    void createLadderTest() {
        Ladder ladder = new Ladder(participates, 5);
        assertThat(ladder.getLadder().size()).isEqualTo(5);
    }

    @Test
    @DisplayName(("사다리 최소 높이 검증 테스트"))
    void validateLadderHeightTest() {
        assertThatThrownBy(() -> new Ladder(participates, 1))
                .isInstanceOf(IllegalArgumentException.class);
    }

}