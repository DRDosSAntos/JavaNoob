package TDD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrajectEenhedenNaarPrijsService {

    private Logger log = LoggerFactory.getLogger(TrajectEenhedenNaarPrijsService.class);

    public int getPriceTrajectEenheden (int aantalTrajectEenheden){
        return (int) (aantalTrajectEenheden * 1.5);
    }
}
