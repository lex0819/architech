package seminar05.middleware;

import seminar05.core.iCameraRepository;
import seminar05.core.iCurrentTrafficRepository;
import seminar05.core.iRoadsRepository;
import seminar05.core.iTripHistory;
import seminar05.core.iCityObjectsRepository;

public class MapController extends TripController{

    private iCityObjectsRepository iCityObjectsRepository;
    public MapController(iRoadsRepository iRoadsRepository, iCurrentTrafficRepository iCurrentTrafficRepository, iCameraRepository iCameraRepository, iTripHistory iTripHistory, iCityObjectsRepository iCityObjectsRepository) {
        super(iRoadsRepository, iCurrentTrafficRepository, iCameraRepository, iTripHistory);

        this.iCityObjectsRepository = iCityObjectsRepository;
    }
}
