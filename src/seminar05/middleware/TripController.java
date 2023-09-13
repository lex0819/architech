package seminar05.middleware;

import seminar05.core.iCameraRepository;
import seminar05.core.iCurrentTrafficRepository;
import seminar05.core.iRoadsRepository;
import seminar05.core.iTripHistory;

public class TripController extends NetController{

    private iTripHistory iTripHistory;
    public TripController(iRoadsRepository iRoadsRepository, iCurrentTrafficRepository iCurrentTrafficRepository, iCameraRepository iCameraRepository, iTripHistory iTripHistory) {
        super(iRoadsRepository, iCurrentTrafficRepository, iCameraRepository);

        this.iTripHistory = iTripHistory;
    }
}
