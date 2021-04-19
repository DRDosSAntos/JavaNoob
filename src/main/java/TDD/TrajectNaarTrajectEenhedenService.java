package TDD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class TrajectNaarTrajectEenhedenService {

    private Logger log = LoggerFactory.getLogger(TrajectNaarTrajectEenhedenService.class);

    public int getTrajectEenheden (String from, String to){
        return new Random().nextInt(50);
    }

}
