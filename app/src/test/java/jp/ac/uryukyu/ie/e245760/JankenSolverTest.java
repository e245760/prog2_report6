package jp.ac.uryukyu.ie.e245760;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JankenSolverクラスのユニットテストを記述するクラス。
 */
public class JankenSolverTest {
    private JankenSolver solver;

    @BeforeEach
    void setUp() {
        solver = new JankenSolver();
    }

    @Test
    void testDetermineWinner() {
        assertEquals("あいこ", solver.determineWinner(0, 0));
        assertEquals("勝ち", solver.determineWinner(0, 1));
        assertEquals("負け", solver.determineWinner(0, 2));
    }

    @Test
    void testHandToString() {
        assertEquals("グー", solver.handToString(0));
        assertEquals("チョキ", solver.handToString(1));
        assertEquals("パー", solver.handToString(2));
        assertThrows(IllegalArgumentException.class, () -> solver.handToString(3));
    }
}