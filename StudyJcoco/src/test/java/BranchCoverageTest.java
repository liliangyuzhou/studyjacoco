import org.junit.jupiter.api.Test;

public class BranchCoverageTest {
    @Test
    public void testBranchCoverage(){
        Example bct = new Example();

        bct.branchFunc(0, 0, 0);
        bct.branchFunc(1, 0, 0);
        bct.branchFunc(0, 1, 0);
        bct.branchFunc(0, 0, 1);

    }
}
