package kr.codesquad.step3.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RowTest {
    private RandomConnection randomConnection;
    private Row row;

    @BeforeEach
    void setUp() {
        randomConnection = new RandomConnection();
    }


    @Test
    @DisplayName("한 라인에 사람 수 만큼 좌표 생성 되었는지 테스트")
    void makeLowTest() {
        //given
        row = new Row(4);
        //when
        int size = row.ladderTypes().size();
        //then
        assertThat(size).isEqualTo(4);
    }

    @Test
    @DisplayName("연결된 직선이 아무것도 없을때 테스트")
    void noRowTest() {
        //given
        row = new Row(0);
        //when
        //then
        assertEquals(LadderType.DISCONNECT, row.connectLadderTypes(randomConnection));
    }
}