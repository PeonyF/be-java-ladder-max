package kr.codesquad.step3.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParticipatesTest {

    @Test
    @DisplayName("입력받은 참가자 이름 생성 테스트")
    void makeParticipates() {
        String inputName = "aa,bb,cc,dd";
        Participates participates = Participates.makeParticipates(inputName);
        assertThat(participates.participatesNames.size()).isEqualTo(4);
    }
}