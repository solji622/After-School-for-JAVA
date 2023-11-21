package BlackBox;

import BlackBox.camera.Camera;
import BlackBox.camera.FactoryCam;
import BlackBox.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속: 부모로부터 재산을 물려받아 자식이 사용하는 것
        // 상속: 부모 클래스에서 제공되는 모든 것들을 자식 클래스에서 갖다 쓴다.
        // 자바는 하나의 부모들만 상속 받을 수 있음 즉, 다중 상속 불가능

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
