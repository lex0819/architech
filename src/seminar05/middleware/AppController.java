package seminar05.middleware;

import seminar05.core.*;
import seminar05.userInterface.*;

public class AppController extends MapController{
    private iGUI iGUI;
    private iUX iUX;
    public AppController(iRoadsRepository iRoadsRepository, iCurrentTrafficRepository iCurrentTrafficRepository, iCameraRepository iCameraRepository, iTripHistory iTripHistory, iCityObjectsRepository iCityObjectsRepository, iGUI iGUI, iUX iUX) {
        super(iRoadsRepository, iCurrentTrafficRepository, iCameraRepository, iTripHistory, iCityObjectsRepository);
        this.iGUI = iGUI;
        this.iUX = iUX;
    }
}
