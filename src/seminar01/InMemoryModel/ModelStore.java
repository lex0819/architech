package seminar01.InMemoryModel;

import seminar01.ModelElements.*;

import java.util.List;


/**
 * Класс хранит список сцен
 * со списками их полигональных моделей,
 * их камер,
 * их источников света
 * и реализует метод слежения за изменением сцены
 */
public class ModelStore implements IModelChanger{
    public List<PolygonalModel> models;
    public List<Scene> scenes;

    public List<Flash> flashes;

    public List<Camera> cameras;

    private IModelChangeObserver changeObserver;

    public ModelStore(IModelChangeObserver changeObserver,
                      List<PolygonalModel> modelsList,
                      List<Scene> scenesList,
                      List<Flash> flashesList,
                      List<Camera> camerasList) {
        this.changeObserver = changeObserver;
        //this.models = new PolygonalModel((List<Polygon>) new Polygon(pointsList), new Texture(textureFile));
        models.addAll(modelsList);
        flashes.addAll(flashesList);
        cameras.addAll(camerasList);
        scenes.addAll(scenesList);
    }

    public Scene getScene(int n) {
        for (int i = 0; i < scenes.size(); i++) {
            if (this.scenes.get(i).getSceneId() == n){
                return scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
