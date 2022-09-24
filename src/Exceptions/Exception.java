package Exceptions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Exception {

    public static void main(String[] args) {
        //Todo Auto-generated method stub
        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("C:\\Users\\Ruben\\Downloads\\asd.jpeg"));
            System.out.println("La imagen existe");
        } catch (IOException e) {
            //Todo: handle exception
            System.out.println("No se encuentra la imagen");
        }
    }
}
