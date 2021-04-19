package TDD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrajectPrijsService {

    private Logger log = LoggerFactory.getLogger(TrajectPrijsService.class);

    private TrajectNaarTrajectEenhedenService trajectNaarTrajectEenhedenService = new TrajectNaarTrajectEenhedenService();
    private TrajectEenhedenNaarPrijsService trajectEenhedenNaarPrijsService = new TrajectEenhedenNaarPrijsService();

    public int getTrajectPrijs(String from, String to){
        log.debug("Eenheden en prijs per eenheid worden opgehaald...");
        int eenheid = trajectNaarTrajectEenhedenService.getTrajectEenheden(from, to);
        int prijs = trajectEenhedenNaarPrijsService.getPriceTrajectEenheden(eenheid);

        return eenheid * prijs;
    }
}
