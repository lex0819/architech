package seminar05.middleware;

import seminar05.core.iRoadsRepository;
import seminar05.core.iCurrentTrafficRepository;
import seminar05.core.iCameraRepository;

public class NetController {
    private iRoadsRepository iRoadsRepository;
    private iCurrentTrafficRepository iCurrentTrafficRepository;
    private iCameraRepository iCameraRepository;

    public NetController(iRoadsRepository iRoadsRepository, iCurrentTrafficRepository iCurrentTrafficRepository, iCameraRepository iCameraRepository){
        this.iRoadsRepository = iRoadsRepository;
        this.iCurrentTrafficRepository = iCurrentTrafficRepository;
        this.iCameraRepository = iCameraRepository;
    }
}
