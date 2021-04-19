package TDD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockLabStart {

    private Logger log = LoggerFactory.getLogger(MockLabStart.class);

    public static void main(String[] args) {
        new MockLabStart().startUp();

    }

    private void startUp() {
        int trajectPrijs = new TrajectPrijsService().getTrajectPrijs("Utrecht", "Amsterdam");
    }
}

