package ModelElements;

import java.util.ArrayList;

/**
 * класс модель сцены
 */
public class Scene {
    public int Id;
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();

    /**
     * конструктор
     *
     * @param inputModels
     * @param inputCameras
     */
    public Scene(PoligonalModel inputModels, Camera inputCameras) {
        models.add(inputModels);
        cameras.add(inputCameras);
    }

}
