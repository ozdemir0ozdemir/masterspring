package ozdemir0ozdemir;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ozdemir0ozdemir.beans.Song;
import ozdemir0ozdemir.beans.VehicleServices;

import java.io.IOException;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Main {


    public static void main(String[] args) throws IOException {
        var context = new AnnotationConfigApplicationContext(Main.class);



        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());

        Song song = new Song();
        song.setTitle("Nothing else matters");
        song.setSingerName("Metallica");
        boolean vehicleStarted = false;


        vehicleServices.moveVehicle(vehicleStarted);
        vehicleServices.playMusic(vehicleStarted, song);
        vehicleServices.applyBrake(vehicleStarted);


        context.registerShutdownHook();
    }
}
