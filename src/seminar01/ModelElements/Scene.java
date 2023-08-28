package seminar01.ModelElements;

import java.util.List;

/**
 * Класс для работы со сценой
 * поле id для каждой сцены в сессии уникально
 * это идентификатор сцены
 * сцена состоит из нескольких полигональных моделей,
 * нескольких камер,
 * нескольких источников света
 */
public class Scene {
    public static int id = 0;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene( List<PolygonalModel> modelsList, List<Flash> flashesList, List<Camera> camerasList) {
        id = id++;
        try{
            models.addAll(modelsList);
        }catch (NullPointerException e){
            System.err.println("modelsList is empty");
        }
        try{
            flashes.addAll(flashesList);
        }catch (NullPointerException e){
            System.err.println("flashesList is empty");
        }
        try{
            cameras.addAll(camerasList);
        }catch (NullPointerException e){
            System.err.println("camerasList is empty");
        }
    }

    public static int getSceneId() {
        return id;
    }

    public List<PolygonalModel> getModels() {
        return models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

/**
 * I don't have any idea about what could do the methods
 */
//    <T> method1(<T> ){
//        return <T>;
//    }
//    <T, type2, type1> method2(<T> type1, <T> type2){
//        return type2;
//    }
}
